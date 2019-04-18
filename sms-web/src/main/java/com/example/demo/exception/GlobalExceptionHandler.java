package com.example.demo.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler {
	@Autowired
	ExceptionResponse exceptionResponse;
	
	public ResponseEntity<ExceptionResponse> serviceExceptionHandler(SMSException e)
	{
		exceptionResponse.setErrorMessage(e.getErrorMessage());
		exceptionResponse.setErrorCode(e.getErrorCode());
		return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
