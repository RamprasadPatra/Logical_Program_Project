package org.oopsConcept.infosyc_client.oops;

public interface Interface1 {
	
	public void input();
	
	public default void input2() {
		System.out.println("Input2 method default method executed in ind=terface");
	}

	public static void input3() {
		System.out.println("hello world!");
	}
}
