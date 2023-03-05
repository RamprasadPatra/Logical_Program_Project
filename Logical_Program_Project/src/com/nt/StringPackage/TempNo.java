package com.nt.StringPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TempNo {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\RAMPRASAD JAVA DEV\\Desktop\\Number.txt");
		
		BufferedReader br=new BufferedReader(fr);
				
		int n=Integer.parseInt(br.readLine());
		int rem=0;
		int rev=0;
		int m=n;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(m==rev)
		System.out.println("Palindram number");
		else
			System.out.println("Not a palindram number");
	}
}