package com.test.rest.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ClassProbabilities implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="Classification name", required=true)
	private String name;
	
	@ApiModelProperty(value="Classification probability", required=true)
	private double probability;
}
