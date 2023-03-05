package com.nt.java8newfeature.MethodReference;

public class Executed {
	//static method refference
	static int x=4;
	
	{
		System.out.println("Instance block executed");
	}
	
	
	
	public static void main(String[] args) {
	
//		I obj=()->{System.out.println("executed");};
//		
//		obj.m1();
//		
	I obj1=Test::input;
		obj1.m1(5);
		
	}
}