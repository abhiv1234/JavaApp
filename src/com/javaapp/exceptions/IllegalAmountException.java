package com.javaapp.exceptions;

public class IllegalAmountException extends Exception{

	private String message;

	public IllegalAmountException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
