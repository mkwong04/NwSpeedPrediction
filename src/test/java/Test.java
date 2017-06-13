
import com.test.h2o.model.GBM_b895d0cd_0e08_4f00_9036_dffcecf110bf;

import hex.genmodel.easy.EasyPredictModelWrapper;
import hex.genmodel.easy.RowData;
import hex.genmodel.easy.prediction.MultinomialModelPrediction;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

	
	public static void main(String[] args) throws Exception{
		EasyPredictModelWrapper model = new EasyPredictModelWrapper(new GBM_b895d0cd_0e08_4f00_9036_dffcecf110bf());
	
		RowData row = new RowData();
		row.put("Connection Type", "Dedicated");
		row.put("Prime Tiem?", "Y");
		row.put("ZipCode", 100001);
		row.put("High Speed Internet Plan", "HIS 80 Mbps");
		
		MultinomialModelPrediction predition = (MultinomialModelPrediction)model.predict(row);
		
		log.info("label : {}",predition.label);
		
		model.getResponseDomainValues();
		
		
	}
}
