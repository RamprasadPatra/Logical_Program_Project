package com.nt.java8newfeature.MethodReference;

public class MethodReference2 {

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}
	
	public void ThreadStatus1() {
		System.out.println("Instance Thread is running...");
	}
	public static void main(String[] args) {
		Thread t2= new Thread(MethodReference2::ThreadStatus);
		t2.start();
		
		MethodReference2 obj= new MethodReference2();
		//Thread obj1=obj::ThreadStatus1;
	}
}
