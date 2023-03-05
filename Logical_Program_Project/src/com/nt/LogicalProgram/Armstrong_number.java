package com.nt.LogicalProgram;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		System.out.println("Enter a no to check prime or composite");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int rem,qube,temp,digits=0,sum=0;
		temp=no;
		
		while(temp>0) {
			//sum of digitsr p
			rem=temp%10;
			digits++;
			temp/=10;
		}
		temp=no;
		while(temp>0) {
			
			rem=temp%10;
			
			sum=sum+ (int)Math.pow(rem, digits);
			temp/=10;
		}
		System.out.println("sum " + sum);
	}
}
