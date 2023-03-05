package com.nt.java8newfeature.LambdaExpression;

public class LambdaExpressionExample2 {
	
	public static void main(String[] args) {
		
		
		//single parameter
		 Drawable2 d1=(String name)->{
		    	return "Ramprasad";
		    };
		    System.out.println(d1.input("Ram"));
	}

   
}