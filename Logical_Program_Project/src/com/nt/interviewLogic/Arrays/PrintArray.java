package com.nt.interviewLogic.Arrays;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {

		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i<arr.length) {
			arr[i]=sc.nextInt();
			    i++;
		}
		for(int arr1: arr) {
			System.out.print(" "+arr1+" ");
		}
	}

}
