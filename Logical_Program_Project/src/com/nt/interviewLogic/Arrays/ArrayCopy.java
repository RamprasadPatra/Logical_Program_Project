package com.nt.interviewLogic.Arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {12,23,43,43,45,23,12,54};
		int[] arr1= new int[arr.length];
		arr1=arr;
		
		
		int[] arr2= new int[arr.length];
		arr2= arr1.clone();
		for(int temp:arr2) {
			System.out.print(temp);
		}
		
		
		
	}
	
}