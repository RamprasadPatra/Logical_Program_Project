package org.oopsConcept.infosyc_client.oops;


public interface Drawable {
	public void draw();
	public void draw1();
	
	public default void input1() {
		input2();
	}
	public static void input2() {
		
	}
}