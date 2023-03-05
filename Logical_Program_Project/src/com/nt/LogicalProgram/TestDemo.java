package com.nt.LogicalProgram;


class Test1{
	
	int m;
	
	Test1(){

		System.out.println("Test1 default constructor");
	}
	Test1(int x){
		this();
		System.out.println("Test1 parameter constructor");
		
	}
	
	public static void Temp() {
		System.out.println("Temp Parent");
	}
	
	public static void Temp(int x) {
		System.out.println("Overloading");
	}
}

public class TestDemo extends Test1{
	
	public static void main(String[] args) {
		
		//new TestDemo().Temp(5);
		new Test1(5);
	}

}
