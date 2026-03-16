package com.example.springboot_rest_test.exception;

public class PersonNotFoundException extends RuntimeException {
	
	public PersonNotFoundException(String message)
	{
		super(message);
	}
}
