package com.nt.interviewLogic.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,5,6};
		
		for(int j=1;j<arr.length;j++)
		{
			for(int i=arr[0];i<arr.length;i++) {            
				if(arr[i]!=j) {
					System.out.println(arr[i]);					
					j++;
					break;	
				}
			}
		}
	}

}
