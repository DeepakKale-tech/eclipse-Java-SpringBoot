package com.example.springboot_rest_test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(PersonNotFoundException.class)
	public ResponseEntity<?> handlerResourceNotFound(PersonNotFoundException px)
	{
		return new ResponseEntity<>(px.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobalException(PersonNotFoundException px)
	{
		return new ResponseEntity<>(px.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
