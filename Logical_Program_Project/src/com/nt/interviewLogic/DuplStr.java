package com.nt.interviewLogic;

public class DuplStr {

		 public static void main(String argu[]) {

		  String str = "Bangalore Hyderabad";
		  int cnt = 0;
		  char[] charArr = str.toCharArray();
		  
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
			  
		   for (int j = i + 1; j < str.length(); j++) {
			   
		    if (charArr[i] == charArr[j]) {	    	
		    	System.out.println(charArr[j]);
		    	cnt++;
		    	break;
		    }
		  }
		}
	}
}