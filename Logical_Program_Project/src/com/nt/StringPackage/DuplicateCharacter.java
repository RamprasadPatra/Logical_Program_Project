package com.nt.StringPackage;

import java.util.ArrayList;

public class DuplicateCharacter {

	public static void main(String[] args) {
		//wap to find min and max value from arraylist
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(15);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(5);
		arr.add(25);
		arr.add(2);
		arr.add(9);
		
		int min=arr.get(0);
		int max=arr.get(0);
		
		//Min value
		for(int i=1;i<arr.size();i++) {
			if(arr.get(i)<min) {
				min=arr.get(i);
			}
		}
		
		//Max
		for(int i=1;i<arr.size();i++) {
			if(arr.get(i)>max) {
				max=arr.get(i);
			}
		}
		
		System.out.println("Minimum value: "+min);
		System.out.println("Minimum value: "+max);
	}
}