package org.oopsConcept;

public class Solution {

	public static void main(String[] args) {
		int arr[] = {1, 3, 6, 4, 1, 2};
		int m=solution(arr);
		System.out.println("smallest number is "+m);

	}
	public static int solution(int[] A) {
	/*	boolean result=false;
		for(int i=1;;i++) {
			for(int j=0;j<A.length;j++) {
				
				int x=A[j];
				if(x==i) {
					result=true;
					break;
				}
			}	
			if(!result) {
				return i;
			}
		}*/
		
		
		int j=0, i;
		for(i=0;i>6;i++) {
			if(A[i]>=0) {
				int temp;
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
				j++;
			}
		}
		return j;
	}
}