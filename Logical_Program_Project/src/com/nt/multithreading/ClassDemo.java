package com.nt.multithreading;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread obj= new MyThread();
		obj.start();
		
		for(int i=0;i<50;i++) {
			System.out.println("Child class");
		}

	}

}
