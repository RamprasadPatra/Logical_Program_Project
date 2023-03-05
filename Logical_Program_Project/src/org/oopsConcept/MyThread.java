package org.oopsConcept;

public class MyThread implements Runnable{

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		MyThread obj=new MyThread();
		
		for(int i=0;i<10;i++) {
			System.out.println("Hi");
		}
	}

	

}
