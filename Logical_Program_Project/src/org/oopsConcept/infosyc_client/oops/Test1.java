package org.oopsConcept.infosyc_client.oops;

public class Test1 {
	
	 public static class TestInner1 {
		 public TestInner1() {
			 System.out.println("TestInner1 Method Executed");
		 }
	 }
	 
	 public class TestInner2{
		 public TestInner2() {
			 System.out.println("TestInner2 Method Executed");
		 }
	 }
	
	 Test1(){
		System.out.println("Constructor Method Executed Successfully");
	}
	
	 Test1(int x){
		 System.out.println("Constructor Method Overloading Executed Successfully");
	 }
	 
	 public static void main(String[] args) {		
			Test1.TestInner1 obj= new Test1.TestInner1();
			Test1.TestInner2 obj1=new Test1().new TestInner2();
		}	
}