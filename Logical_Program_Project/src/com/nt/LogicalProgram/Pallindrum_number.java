package com.nt.LogicalProgram;

import java.util.Scanner;

public class Pallindrum_number {

	public static void main(String[] args) {
		System.out.println("Enter a no to check pallindrum number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int org=no,rem,rev=0;
        while(no>0) {
        	rem=no%10;
        	rev=rev*10+rem;
        	no=no/10;
        }
        if(org==rev)
        	System.out.println("Pallindrum numner");
        else
        	System.out.println("Not a Pallindrum number");
	}
}