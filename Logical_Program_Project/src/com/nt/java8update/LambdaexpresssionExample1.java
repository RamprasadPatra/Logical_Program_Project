package com.nt.java8update;

public class LambdaexpresssionExample1 {

	public static void main(String[] args) {
		
		Drawable d2=(int x,int y)->{
			System.out.println("Hello"+x+y);
		};
		d2.draw(5,6);
	}

}
