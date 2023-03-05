package com.nt.designpattern.singleton;

public class TestSingleton {
	
	 public static TestSingleton objectone= new TestSingleton();
	 
	 private TestSingleton() {
		 
	 }

	public static TestSingleton Test() {
		
		return objectone;

	}

}
