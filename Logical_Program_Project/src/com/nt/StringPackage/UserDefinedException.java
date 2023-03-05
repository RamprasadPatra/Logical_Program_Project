package com.nt.StringPackage;

import java.io.IOException;

public class UserDefinedException {


	public static void main(String[] args) throws IOException{
		
		try {
			throw new MyException(2);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}