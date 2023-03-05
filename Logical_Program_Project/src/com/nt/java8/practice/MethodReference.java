package com.nt.java8.practice;

public class MethodReference {

	public static void saySomething() {
		System.out.println("Hello Sayble called");
	}
	public static void main(String[] args) {
		Sayble sayble=MethodReference::saySomething;
		sayble.say();
	} 
}
