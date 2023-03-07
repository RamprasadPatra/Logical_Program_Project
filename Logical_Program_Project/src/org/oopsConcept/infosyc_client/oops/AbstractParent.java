package org.oopsConcept.infosyc_client.oops;

public abstract class AbstractParent {
	
	//Constructor
	public AbstractParent() {
		
	}
	
	//Non abstract method
	public void input() {
		System.out.println("Abstract input() method executed");
	}
	
	//Static method
	public static void input1() {
		
	}
	
	//Abstract method
	public abstract void input2();
	
	//Final method
	
	public final void input3() {
		System.out.println("Final method executed successfully");
	}
	

	
}