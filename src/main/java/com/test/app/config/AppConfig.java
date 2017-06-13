package com.test.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.test.h2o.model.GBM_b895d0cd_0e08_4f00_9036_dffcecf110bf;

import hex.genmodel.easy.EasyPredictModelWrapper;
import lombok.extern.slf4j.Slf4j;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * Spring boot application configuration
 *
 */
//enable swagger 2 documentation configuration
@EnableSwagger2
@Slf4j
@Configuration
public class AppConfig {

	@Bean
	public EasyPredictModelWrapper gbmModel(){
		return new EasyPredictModelWrapper(new GBM_b895d0cd_0e08_4f00_9036_dffcecf110bf());
	}
	/** Swagger2 UI Doc **/
	@Bean
	public Docket swaggerUI(){
		log.info("Initializing swagger2 UI");
		
		return new Docket(DocumentationType.SWAGGER_2).select()
													  .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
													  .build()
													  .apiInfo(new ApiInfoBuilder().title("Test API Documentation")
															                       .description("Test API Documentation")
															                       .build())
													  //don't generate doc with default response code
													  .useDefaultResponseMessages(false);
	}
}
