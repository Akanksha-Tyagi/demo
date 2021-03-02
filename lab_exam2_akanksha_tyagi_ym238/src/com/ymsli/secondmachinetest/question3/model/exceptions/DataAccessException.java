package com.ymsli.secondmachinetest.question3.model.exceptions;


//custom exception wrapper class
public class DataAccessException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DataAccessException(String message) {
		super(message);
	}
}
