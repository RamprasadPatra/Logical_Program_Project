package com.nt.StringPackage;

import java.util.Arrays;

public class Reverse_String {
	
	public void inputString(String name) {
		
		char[] arrconvert= name.toCharArray();
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(arrconvert[i]);
		}
	}
	
	public static void stringDuplicate(char[] totalNoofChar,int n) {
		
		int m=0;
		//Total Character read
		for(int i=0;i<n;i++) {		
			int j;
			for(j=0;j<i;j++) {
				if(totalNoofChar[i] == totalNoofChar[j]) //if same element
					break;
			}
			
			if(j==1)
				totalNoofChar[m++]=totalNoofChar[i];
		}
		String result= String.valueOf(Arrays.copyOf(totalNoofChar, m));
		System.out.println(result);
		
	}

	public static void main(String[] args) {
	//	String nameOriginal="Hyderabad";
		//new Reverse_String().inputString(nameOriginal);
		
		//String Duplicate 
		String originalString="swiggy";
		char[] noofChar=originalString.toCharArray();
		int n=originalString.length();
		Reverse_String.stringDuplicate(noofChar,n);
	}
}