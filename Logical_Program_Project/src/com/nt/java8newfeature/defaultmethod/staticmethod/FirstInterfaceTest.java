package com.nt.java8newfeature.defaultmethod.staticmethod;

@FunctionalInterface
public interface FirstInterfaceTest {
	
	public abstract void input1();
	
	public default void input2() {
		System.out.println("Default method executed successfully");
	}

	public static void input3() {
		System.out.println("Static method executed successfully");
	}
	
}