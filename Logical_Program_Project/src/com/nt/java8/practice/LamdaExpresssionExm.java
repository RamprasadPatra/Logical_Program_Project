package com.nt.java8.practice;

public class LamdaExpresssionExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable dr=()->{
			System.out.println("Called");
		};
		dr.draw();

	}

}
