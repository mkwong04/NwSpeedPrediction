package com.test.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.model.ClassProbabilities;
import com.test.rest.model.Message;
import com.test.rest.model.PredictRequest;
import com.test.rest.model.PredictResponse;

import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.exception.PredictException;
import hex.genmodel.easy.prediction.MultinomialModelPrediction;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestRESTController extends AbstractRESTController{
	
	@Autowired
	@Qualifier("gbmModel")
	private EasyPredictModelWrapper gbmModel;

	/**
	 * 
	 * @param request
	 * @return
	 */
	@CrossOrigin(origins={"*"}, 
			     methods={RequestMethod.POST},
			     allowedHeaders={"origin", "content-type", "accept", "authorization"})
	@ApiOperation(value="Predict Network Speed",
				  notes="Predict Network Speed",
				  consumes = MediaType.APPLICATION_JSON_VALUE,
				  produces = MediaType.APPLICATION_JSON_VALUE,
				  tags={"Network Speed"})
	@RequestMapping(path="/networkspeed/predict",
					method=RequestMethod.POST,
					consumes={"application/json"},  
					produces={"application/json"})
	@ApiResponses(value={
			@ApiResponse(code=200, message="Prediction successfully", response=PredictResponse.class),
			@ApiResponse(code=500, message="Unexpected internal error", response=Message.class)
		})
	@ResponseStatus
	@SuppressWarnings("rawtypes")
	public ResponseEntity predictNetworkSpeed(@RequestBody PredictRequest request){
		
		RowData row = new RowData();
		row.put("Connection Type", request.getConnectionType());
		row.put("Prime Tiem?", request.getPeakHourInd());
		row.put("ZipCode", request.getZipCode());
		row.put("High Speed Internet Plan", request.getHisPlan());
		
		try {
			MultinomialModelPrediction predition = (MultinomialModelPrediction)gbmModel.predict(row);
			
			PredictResponse response = new PredictResponse();
			
			response.setPredictedResult(predition.label);
			
			String[] domainValues = gbmModel.getResponseDomainValues();
			
			if(predition.classProbabilities.length != domainValues.length){
				return badRequest("mismatch of classification");
			}
			
			for(int idx=0; idx<predition.classProbabilities.length; idx++){
				ClassProbabilities classProb = new ClassProbabilities();
				
				classProb.setName(domainValues[idx]);
				classProb.setProbability(predition.classProbabilities[idx]);
				
				response.getClassificationProbabilities().add(classProb);
			}
			
			return ok(response);
			
		} 
		catch (PredictException e) {
			log.error("Exception during prediction :{}",e.getMessage());
			e.printStackTrace();
			
			return internalServerError(e.getMessage());
		}
		
	}
}
