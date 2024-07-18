package com.javaapp.exceptions;

public class IllegalMarksException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public IllegalMarksException(String message) {
		super(message);
		this.message = message;
	}
	
}

/*
 * To make the class an Exception class, we must extend it with Exception
 * And to make it a checked exception class, we must use Exception
 * For making it Unchecked, we must use RuntimeException
 */