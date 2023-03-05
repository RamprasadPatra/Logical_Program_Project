package com.nt.LogicalProgram;

import java.util.Scanner;

public class Fibonasic_Series {

	public static void main(String[] args) {
		System.out.println("Enter a no to check Fibonasic series");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();

		int i=0,j=1, result=0, count=0;
		System.out.print(+i +" " +j + " ");
		while(count<no) {
			result=i+j;
			System.out.print(+result+ " ");
		    i=j;
		    j=result;   
			count++;
			
		}
	}
}