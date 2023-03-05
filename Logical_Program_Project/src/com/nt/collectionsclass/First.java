package com.nt.collectionsclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class First {

	public static void main(String[] args) {
		
		List list=new ArrayList<String>();
		list.add("c++");
		list.add("Java");
		list.add("DotNet");
		list.add("Microservices");
				
		Collections.sort(list);
		Iterator iter=list.iterator();
		
		String[] arr= (String[]) list.toArray();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("Sorting Elemetnts are");
		
		
		List intlist=new ArrayList<>();
		intlist.add(4);
		intlist.add(5);
		intlist.add(6);
		
		//array
		int[] arr1= {4,5,6,7};
	
		System.out.println("Max"+ Collections.max(intlist));
		System.out.println("Min"+ Collections.max(intlist));
		
		Collections.addAll(list, intlist);
		System.out.println(list);
	}

}
