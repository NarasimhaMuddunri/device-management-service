package com.device.management.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Generic response
 * 
 *
 * @param <T>
 */
public class Response<T> extends ResponseEntity<T>{
	/**
	 * Constructor
	 * @param body <{@link T}>
	 * @param status {@link HttpStatus}
	 */
	public Response(T body, HttpStatus status) {
		super(body, status);		
	}
	/**
	 * Success response
	 * @param <@link T>
	 * @param type <@link T>
	 * @return {@link Response}<{@link T}>
	 */
	public static <T> Response<T> createSuccessResponse(T type) {
		return new Response<>(type,HttpStatus.OK);		
	}
	/**
	 * Failed response
	 * @param <@link T>
	 * @param status {@link HttpStatus}
	 * @param type <@link T>
	 * @return {@link Response}<{@link T}>
	 */
	public static <T> Response<T> createFailedResponse(HttpStatus status, T type) {
		return new Response<>(type,status);
	}
}
