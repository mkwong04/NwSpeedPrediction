package com.test.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;

import com.test.rest.model.Message;

/**
 * 
 * abstract REST API controller
 *
 */
public abstract class AbstractRESTController {

	public static final String BY_API ="Api";
	
	/**
	 * 
	 * @param message
	 * @return
	 */
	protected ResponseEntity<Message> ok(String message){
		
		Message body = new Message();
		body.setMessage(message);
		
		return ok(body);
	}
	/**
	 * 
	 * @param body
	 * @return
	 */
	protected <T>ResponseEntity<T> ok(T body){
		return buildResponseEntity(body, HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param body
	 * @return
	 */
	protected <T>ResponseEntity<T> created(T body){
		return buildResponseEntity(body, HttpStatus.CREATED);
	}
	
	
	/**
	 * 
	 * @param message
	 * @return
	 */
	protected ResponseEntity<Message> badRequest(String message){
		Message body = new Message();
		body.setMessage(message);

		return badRequest(body);
	}
	
	/**
	 * 
	 * @param body
	 * @return
	 */
	protected <T>ResponseEntity<T> badRequest(T body){
		return buildResponseEntity(body, HttpStatus.BAD_REQUEST);
	}

	/**
	 * 
	 * @param body
	 * @return
	 */
	protected ResponseEntity<Message> notFound(String message){
		
		Message body = new Message();
		body.setMessage(message);
		
		return notFound(body);
	}
	/**
	 * 
	 * @param body
	 * @return
	 */
	protected <T>ResponseEntity<T> notFound(T body){
		return buildResponseEntity(body, HttpStatus.NOT_FOUND);
	}
	
	/**
	 * 
	 * @param body
	 * @return
	 */
	protected <T>ResponseEntity<T> unauthorize(T body){
		return buildResponseEntity(body, HttpStatus.UNAUTHORIZED);
	}
	/**
	 * 
	 * @param body
	 * @return
	 */
	protected <T>ResponseEntity<T> internalServerError(T body){
		return buildResponseEntity(body, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/**
	 * 
	 * @param body
	 * @return
	 */
	protected ResponseEntity<Message> internalServerError(String message){
		Message body = new Message();
		body.setMessage(message);
	
		return internalServerError(body);
	}

	/**
	 * 
	 * @param body
	 * @param status
	 * @return
	 */
	private <T>ResponseEntity<T> buildResponseEntity(T body, HttpStatus status){
		BodyBuilder builder = ResponseEntity.status(status);
		return builder.body(body);
	}
}
