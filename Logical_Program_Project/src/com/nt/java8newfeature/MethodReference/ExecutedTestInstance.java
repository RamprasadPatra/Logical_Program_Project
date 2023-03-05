package com.nt.java8newfeature.MethodReference;

public class ExecutedTestInstance {
	//Reference to instance method
	public static void main(String[] args) {
		
		
		TestInstanceMethod obj= new TestInstanceMethod();
		
		Interface1 obj1= obj::TestInstance;
		obj1.m1();
	}
}