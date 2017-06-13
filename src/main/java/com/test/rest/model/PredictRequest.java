package com.test.rest.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PredictRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "Connection Type",allowableValues="Dedicated,Telephone landline,Virtual-Circuit", required=true)
	private String connectionType;
	
	@ApiModelProperty(value = "Peak Hours Indicator", allowableValues="Y,N", required=true)
	private String peakHourInd;
	
	@ApiModelProperty(value = "Zip Code", required=true)
	private int zipCode;
	
	@ApiModelProperty(value = "High Speed Internet Plan", allowableValues="HIS 100 Mbps,HIS 80 Mbps,HIS 60 Mbps,HIS 40 Mbps", required=true)
	private String hisPlan;

}
