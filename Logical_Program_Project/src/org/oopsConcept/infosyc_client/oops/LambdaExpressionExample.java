package org.oopsConcept.infosyc_client.oops;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable obj=new Drawable() {
			public void draw() {
				System.out.println("Draw method executed");
			}

			@Override
			public void draw1() {
				System.out.println("Draw1 method executed");
			}
		};

	};

}
