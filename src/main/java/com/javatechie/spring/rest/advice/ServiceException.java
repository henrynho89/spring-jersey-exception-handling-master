package com.javatechie.spring.rest.advice;

public class ServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int statusCode;

	public ServiceException(String message,int statusCode) {
		super(message);
		this.statusCode=statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public ServiceException(int statusCode) {
		super();
		this.statusCode = statusCode;
	}
	
	

}
