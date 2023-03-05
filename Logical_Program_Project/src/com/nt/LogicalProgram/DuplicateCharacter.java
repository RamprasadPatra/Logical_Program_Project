package com.nt.LogicalProgram;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		String nameString="Hello";
		
		int count;
		
		//we need to convert whole string to character array
		char stringChar[]=nameString.toCharArray();
		
		for(int i=0;i<stringChar.length;i++) {
			
			count=1;
			for(int j=i+1;j<stringChar.length;j++) {
				if(stringChar[i]==stringChar[j]) {
					count++;		
					
					stringChar[j]='0';
				}
			}

			
			//duplicate element
			if(count>1 && stringChar[i]!='0') {
				System.out.println(stringChar[i]);
			}
		}

	}

}
