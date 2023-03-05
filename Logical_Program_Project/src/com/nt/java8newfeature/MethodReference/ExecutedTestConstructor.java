package com.nt.java8newfeature.MethodReference;

public class ExecutedTestConstructor {

	public static void main(String[] args) {
	
		Interface2 obj= TestConstructorMethod::new;
		obj.m1();
	}

}
