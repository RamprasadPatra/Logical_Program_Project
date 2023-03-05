package com.nt.exceptionhandling.customized.uncheckedexception;

//unchecked exception
public class UnderAgeException extends RuntimeException {

	public UnderAgeException() {
		super("Under age 18 not allowed");
	}

	public UnderAgeException(String message) {
		super("Under age 18 not allowed");
	}
	
}
