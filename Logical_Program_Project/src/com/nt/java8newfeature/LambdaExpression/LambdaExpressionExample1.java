package com.nt.java8newfeature.LambdaExpression;

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		
		String name="Ramprasad";
		
		Drawable1 d2=()->{
			System.out.println("Drawble1 executed successfully");
		};
		d2.draw1();
		
		
	}

}
