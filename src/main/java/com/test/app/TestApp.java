package com.test.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.test.app.config.AppConfig;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * Test spring boot application
 *
 */
@SpringBootApplication(scanBasePackages = {"com.test.rest.controller"})
@Slf4j
public class TestApp {

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		
		log.info("Starting standalone spring boot application");
		
		//build a spring application with config/component class and run with arguments
		new SpringApplicationBuilder(TestApp.class).sources(AppConfig.class)
																   .run(args);
	}
}
