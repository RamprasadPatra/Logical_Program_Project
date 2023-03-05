package com.nt.StringPackage;

public class TestConstructor {
	
	public TestConstructor() {
		System.out.println("Default Constructor called");
	}
	
	public TestConstructor(int x) {
		System.out.println("Parameterise constructor "+x);
	}

	public static void main(String[] args) {
		
		TestConstructor obj=new TestConstructor();
		new TestConstructor(56);
	}

}
