package com.nt.interviewLogic;

public class PrimeorComposite {
	 
	    public static void main(String[] args)
	    {
	        int n = 105;
	        boolean result;
	        
	        if ((n ^ 1) == n + 1)
	        	result=true;
	        else
	        	result=false;
	        
	        if(result==true)
	        	System.out.print("Even");
	        else
	        	System.out.println("Odd");
	    }
}
