package com.nt.StringPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WhiteSpaceChar {

	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("C:\\Users\\RAMPRASAD JAVA DEV\\Desktop\\Number.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String data=br.readLine();
			char[] arr=data.toCharArray();
			for(char i: arr) {
				if(Character.isWhitespace(i)) {
					System.out.println("White space included");
				}
				else
					System.out.println("Not having white space");
			}	
		}
		catch(IOException ex) {
			System.out.println("Having some issue with technical inputs");
		}
		finally {
			System.out.println("Thanks for using BANK");
		}
		
	

	}

}
