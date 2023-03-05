package com.nt.LogicalProgram;

public class SmallestNumber {

	public static void main(String[] args) {
		
		int arrOne[]= {21,31,11,1};
		
		int tempNumber;
		
		for(int i=0;i<arrOne.length;i++) {
			for(int j=i+1;j<arrOne.length;j++) {
				
				if(arrOne[i]>arrOne[j]) {
					tempNumber=arrOne[i];
					arrOne[i]=arrOne[j];
					arrOne[j]=tempNumber;
				}
			}
		}
		System.out.println("Second Highest Number"+arrOne[1]);

	}
}