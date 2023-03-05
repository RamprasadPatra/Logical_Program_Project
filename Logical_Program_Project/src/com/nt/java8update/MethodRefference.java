package com.nt.java8update;

public class MethodRefference {
	
	public static void saySomething() {
		System.out.println("Hello world");
	}
	
	public void test() {
		System.out.println("Test method executed");
	}

	public static void main(String[] args) {
		
		say obj= MethodRefference::saySomething;
		obj.say();
		

	}
	

}
