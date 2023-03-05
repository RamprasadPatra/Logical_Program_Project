package com.nt.interviewLogic.Arrays;

public class ArrayFreequecncy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {1,2,3,2,3,1,4,5,6,4,5,9,9,9,9};
		
		//array element frequency check
		
		int count;
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}					
			}
			System.out.println(arr[i] +"is there "+ count+ " times");
		}

		int[] arr1= new int[] {1,2,3,2,3,1,4,5,6,4,5,9,9,9,9};
		arr1[arr1.length]=arr1[0];
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				arr1[0]=arr1[j];
			}
		}
		
		
		
		for(int temp:arr1) {
			System.out.println(temp);
		}
	}

}
