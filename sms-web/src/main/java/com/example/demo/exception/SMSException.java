package com.example.demo.exception;

public class SMSException extends RuntimeException {

	String errorCode;
	String errorMessage;
	
	
	public SMSException(String message, String errorCode) {
		super(message);
		this.errorCode=errorCode;
		this.errorMessage=message;
		
	}
	public SMSException(String message, Throwable cause) {
		super(message,cause);
		
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
}
