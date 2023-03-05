package com.nt.StringPackage;

import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		String str="hello Print";
		int length=str.length();
		char[] chArr=str.toCharArray();
		for(int i=length-1;i>=0;i--) {
			System.out.print(chArr[i]);
		}

		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		
		//Approach-3
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		StringBuilder sbuilder=new StringBuilder(str);
		System.out.println(sbuilder.reverse());
	}
}