package org.oopsConcept.infosyc_client.oops;

public class B extends A{
	int x=45;
	B(){
		super.input();
		System.out.println("B Child constructor executed successfully"+super.x);
		
	}
	
	
	public void input() {	
		System.out.println("input B class method executed");
	}

	public static void main(String[] args) {
		B obj= new B();
		
	}
}
