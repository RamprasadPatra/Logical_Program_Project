
package com.nt.java8newfeature.LambdaExpression;

public class LambdaExpressionExample3 {
	
	public void input() {
		
	}

	public static void main(String[] args) {
		
		
		//with multiple parameters
		Drawable3 d1=(int x, String name)->{
			return name;
		};
		System.out.println(d1.input1(0, "My Name is Ramprasad"));
		
		
		
		//without return any value
		Drawable3 d2=(a,b)->(a+b);
		System.out.println(d2.input1(1, "Raju"));
	}
    
}
