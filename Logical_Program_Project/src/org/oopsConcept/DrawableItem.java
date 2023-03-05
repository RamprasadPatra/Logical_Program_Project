package org.oopsConcept;

@FunctionalInterface
public interface DrawableItem {
	public void draw();
	
	public default void input1() {
		System.out.println("Default method executed");
	}
	
	public static void input2(){
		System.out.println("input 2 static method executed");
	}
}