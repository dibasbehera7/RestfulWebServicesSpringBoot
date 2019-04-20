package com.dbhub.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	
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
	
	public HelloWorldBean(String msg) {
		this.message =  msg;
	}
	
	
}
