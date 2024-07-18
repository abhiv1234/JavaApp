package com.javaapp.exceptions;

public class OverTheLimitException extends Exception {

	private String message;

	public OverTheLimitException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
