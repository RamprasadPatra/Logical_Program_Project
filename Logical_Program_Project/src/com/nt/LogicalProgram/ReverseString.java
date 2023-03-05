package com.nt.LogicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// String Reverse
	/*	System.out.println("Enter your Name:");
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		char[] namechar=name.toCharArray();
		for(int i=namechar.length-1;i>=0;i--) {
			System.out.print(namechar[i]);	
		}	
		
		*/
		
		//using String builder
		/*System.out.println("Enter your Name:");
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		
		StringBuilder sb=new StringBuilder();
		sb.append(name);
		System.out.println(sb.reverse());
		*/
		
		//using String buffer
		System.out.println("Enter your Name:");		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		StringBuffer sb= new StringBuffer();
		sb.append(name);
		System.out.println(sb.reverse());
		
	}
}