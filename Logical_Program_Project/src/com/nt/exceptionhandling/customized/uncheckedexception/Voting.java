package com.nt.exceptionhandling.customized.uncheckedexception;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		
		System.out.println("Enter Your Age");
		Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new UnderAgeException();
			}
			else{
				System.out.println("You can vote now");
			}
		}
		catch(UnderAgeException UE) {
			UE.printStackTrace();
		}
		System.out.println("Printed last");
	}

}
