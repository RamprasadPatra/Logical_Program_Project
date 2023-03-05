package com.nt.StringPackage;

public class RemoveSpeical_Char {

	public static void main(String[] args) {
		String str="$java!^&ar";
		String planstr=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(planstr);
		
		//Remove all white spaces by giving string
		String str1="ja   va st a r   ";
		String trimmerstr=str1.replaceAll("\\s","");
		
		System.out.println(trimmerstr);
	}
}