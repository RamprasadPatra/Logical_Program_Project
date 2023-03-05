package com.nt.StringPackage;

import java.util.Scanner;

public class PrimeCompo {

	public static void main(String[] args) {
		System.out.println("Enter a no to check prime or compo");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//10
		
		int m=n/2;//5
		int temp=0;
		if(n==0 || n==1)
			System.out.println(n+" is not a prime no");
		for(int i=2;i<m;i++) {
			if(n%i==0)
				temp++;
		}
		if(temp==0)
			System.out.println("Prime no");
		else
			System.out.println("Not a prime no");
	}
}