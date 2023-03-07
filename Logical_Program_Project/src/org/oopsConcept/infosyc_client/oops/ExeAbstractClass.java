package org.oopsConcept.infosyc_client.oops;

public class ExeAbstractClass extends AbstractParent{
	
	 
	public static void main(String[] args) {
		AbstractParent obj= new ExeAbstractClass();
		obj.input2();
		obj.input1();
		AbstractParent.input1();
	
	}
	@Override
	public void input2() {
		// TODO Auto-generated method stub
		System.out.println("Input2 method executed successfully");
	}
	
	

}
