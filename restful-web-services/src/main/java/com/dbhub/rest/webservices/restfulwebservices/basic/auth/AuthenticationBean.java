package com.dbhub.rest.webservices.restfulwebservices.basic.auth;

public class AuthenticationBean {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
		//return String.format("HelloWorldBean [message = %s]", message);
	}
	
	public AuthenticationBean(String msg) {
		this.message =  msg;
	}
	
	
}
