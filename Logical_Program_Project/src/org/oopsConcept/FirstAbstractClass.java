package org.oopsConcept;

public abstract class FirstAbstractClass extends TestAbstract {

	public abstract void input1();
	public abstract void input2();
	
	public FirstAbstractClass() {
		
	}
	public void input3() {
		System.out.println("Input 3 executed");
	}
	
	void input4() {
		System.out.println("non static method executed");
	}
	
	static void input5() {
		System.out.println("static method executed");
	}
	
	final void input6() {
		System.out.println("final method executed");
	}
}