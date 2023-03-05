package com.nt.LogicalProgram;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
	
		System.out.println("Enter a no to check prime or composite");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int cnt=2;
		if(no== 0 || no==1)
			System.out.println("Not a Prime number");
		else {
		for(int i=2;i<no;i++) {
			if(no%i==0)
			{
				cnt++;
				break;
			}
		}
		if(cnt>2)
			System.out.println("Composite number");
		else
			System.out.println("Prime number");
		main(args);
	}
	}
}
