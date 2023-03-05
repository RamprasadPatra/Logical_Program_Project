package com.nt.StringPackage;

public class DuplicateCharacterOne {

	public static void main(String[] args) {
		String name="Apple";
		name=name.trim();
		char[] arr=name.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.print(arr[i]);
			}
		}

	}

}
