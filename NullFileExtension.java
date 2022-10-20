package com.Exception.bll;


//creating user defined null file exception.

public class NullFileException extends Exception {
	public NullFileException() {
		super();
	}
	
	public NullFileException(String message ) {
		super(message);
	}
}