package com.nt.interviewLogic.Arrays;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		
		int[] arr1=new int[] {10,12,5,23,43,1};

		int[] arr2=new int[] {10,12,5,23,1,43};

		System.out.println(Arrays.equals(arr1, arr2));
}
}