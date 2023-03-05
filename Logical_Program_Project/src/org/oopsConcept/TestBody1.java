package org.oopsConcept;

public class TestBody1 extends TestBody {
	
	public TestBody1() {
		super();
		System.out.println("Test body1 constrcutor");
	}

	public static void method1() {
		System.out.println("method1 child class executed");
	}
	
	@Override
	public void method2() {
		
		System.out.println("method2 child class executed");
	}
	
	public static void main(String[] args) {
		new TestBody1().method2();
	}
}
