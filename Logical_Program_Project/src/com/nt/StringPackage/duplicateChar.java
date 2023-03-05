package com.nt.StringPackage;

public class duplicateChar {

	public static void main(String[] args) {
		String name="I am am learning java java";
		String[] arr=name.split(" ");
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/	
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j]))
					System.out.println(arr[i]);
			}
		}
	}
}