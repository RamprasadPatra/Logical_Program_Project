package com.nt.exceptionhandling.customized.checkedexception;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Age");
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new  UnderAgeException();
			}
			else {
				System.out.println("You can vote now");
			}
		}
		catch(UnderAgeException ex) {
			ex.printStackTrace();
		}
	}

}
