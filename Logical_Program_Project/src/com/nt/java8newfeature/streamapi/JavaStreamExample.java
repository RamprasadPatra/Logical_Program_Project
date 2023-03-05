package com.nt.java8newfeature.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {

	public static void main(String[] args) {
		List<Product> productList= new ArrayList<>();
		productList.add(new Product(1, "Ramprasad", 10000f));
		productList.add(new Product(2, "Shyam", 50000f));
		productList.add(new Product(3, "Rahul", 3000f));
		productList.add(new Product(4, "Naveen", 13000f));
		productList.add(new Product(5, "Situn", 500000f));
		productList.add(new Product(6, "Dipu", 300440f));
		
		
		
		//before streamAPI how we can filtering the data from the collection
		List<Product> filterProduct= new ArrayList<Product>();
		for(Product product: productList) {
			if(product.price>30000) {
				filterProduct.add(new Product(product.id, product.name, product.price));
			}
		}
		
		productList.forEach((item)->System.out.println(item.id + item.name + item.price));
		System.out.println("----------");
		productList.stream().filter(product1->product1.price==3000f)
		.forEach(product1->System.out.println(product1.name));
		System.out.println("----------");
		
		//using collectors grouping the element from the collection
		
		System.out.println(productList.stream().map(x->x.price).collect(Collectors.toList()));
		
		
		List item= new ArrayList<>();
		item.add("12");
		item.add("14");
		item.add("11");
		item.add("11");
		item.add("110");
		
		item.forEach(item1->System.out.println(item1));
		
	}

	
	
}
