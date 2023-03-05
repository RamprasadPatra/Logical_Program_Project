package com.nt.StringPackage;

public class SBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Durga");
		System.out.println(sb.charAt(3));
		System.out.println(sb.length());
		System.out.println(sb.capacity());//16 is the default capacity in string buffer
	
		StringBuffer sb1= new StringBuffer("Java");
		sb1.setCharAt(0, 'Y');
		System.out.println(sb1);
		
		
	}
}