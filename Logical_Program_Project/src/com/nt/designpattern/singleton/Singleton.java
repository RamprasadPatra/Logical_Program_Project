package com.nt.designpattern.singleton;

import com.nt.java8newfeature.MethodReference.Test;

public class Singleton {
	
	public static void main(String[] args) {
		TestSingleton TS1= TestSingleton.Test();
		TestSingleton TS2= TestSingleton.Test();
		
		System.out.println(TS1.Test());
		System.out.println(TS1.Test());
	}

}
