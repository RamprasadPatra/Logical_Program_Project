package com.nt.LogicalProgram;

import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {

		System.out.println("Enter a no to check factorial number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int fact=1;
		while(no>0) {
			fact=fact*no;
			no--;
		}
		System.out.println("Factorial number:" +fact);
	}

}
