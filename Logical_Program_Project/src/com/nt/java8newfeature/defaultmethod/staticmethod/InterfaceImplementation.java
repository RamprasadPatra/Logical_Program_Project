package com.nt.java8newfeature.defaultmethod.staticmethod;

import java.util.ArrayList;
import java.util.List;

public class InterfaceImplementation implements FirstInterfaceTest {

	public static void main(String[] args) {
		
		FirstInterfaceTest obj=new InterfaceImplementation();
		obj.input1();
		obj.input2();
		
		FirstInterfaceTest.input3();
		
		
		List<String> gamesList = new ArrayList<String>();  
		gamesList.add("Football");  
		gamesList.add("Cricket");  
	    gamesList.add("Chess");  
	    gamesList.add("Hocky");  
	    
	    
	    gamesList.forEach(item->{System.out.println(item);});
		
	}

	@Override
	public void input1() {
		System.out.println("input 1 executed");
		
	}

	
    
}