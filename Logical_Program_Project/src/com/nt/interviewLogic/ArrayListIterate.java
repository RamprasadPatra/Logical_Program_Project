package com.nt.interviewLogic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterate {

	public static void main(String[] args) {
		
		//ArrayList iterate using for loop
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			arr.add(i);
		}
		
		//Print number using for loop
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		//using while loop
		
		int size=arr.size();
		int i=0;
		while(size>0) {
			System.out.print(arr.get(i)+" ");
			i++;
			size--;
		}
		System.out.println();
		//using Advanced for loop
		for(Integer J : arr) {
			System.out.print(J+ " ");
		}
	}
}