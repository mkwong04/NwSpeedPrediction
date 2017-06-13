package com.test.rest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PredictResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="Predicted result")
	private String predictedResult;
	
	@ApiModelProperty(value="Predicted result break down by probability")
	private List<ClassProbabilities> classificationProbabilities = new ArrayList<>();

}
