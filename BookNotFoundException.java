package com.exceptions.demo;

public class BookNotFoundException extends Exception {
	
	public BookNotFoundException(String msg) {
		super(msg);
	}
}
