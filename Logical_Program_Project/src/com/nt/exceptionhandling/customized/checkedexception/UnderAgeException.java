package com.nt.exceptionhandling.customized.checkedexception;

//checked exception
//exceptions are checked in compile time
public class UnderAgeException extends Exception {
	
	public UnderAgeException() {
		super("Age should be more than 18");
	}
	
	public UnderAgeException(String name) {
		super(name);
	} 
}