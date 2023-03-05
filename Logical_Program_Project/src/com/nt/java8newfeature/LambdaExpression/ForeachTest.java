package com.nt.java8newfeature.LambdaExpression;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class ForeachTest {

	public static void main(String[] args) {

     List<Integer> list= new ArrayList<Integer>();
     
      list.add(23);
      list.add(45);
      list.add(56);
      list.add(65);
      list.add(23);
      
      
      
     list.forEach((n)->System.out.println(n));     //java 8 foreach method  
     
     list.forEach((n)->System.out.println(n));
    
    
    
    List<String> studentDetails= new LinkedList<>();
    
    studentDetails.add("Ramprasad Patra");
    studentDetails.add("Raju");
    studentDetails.add("Premanand");
    
    studentDetails.forEach((n)->System.out.println(n));
    
  
    //Data from Employee class using List collection
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Empno");
    int EmpID=sc.nextInt();
    
    System.out.println("Enter Empname");
    String EmpName=sc.next();
    
    System.out.println("Enter EmpAddress");
    String EmpAddress=sc.next();
    
    System.out.println("Enter EmpRegNo");
    int EmpRegno=sc.nextInt();
    
    
    Employee e1=new Employee(EmpID, EmpName, EmpAddress, EmpRegno);   
    
    List<Employee> listEmp= new ArrayList<>();
    listEmp.add(e1);
    
    System.out.println(listEmp.toString());
    
    
    //using for loop iterate data from collection
    for(int i=0;i<listEmp.size();i++) {
    	System.out.println(listEmp.get(i));
    }
     
    
    //using foreach loop iterate data from the collection
    int[] arr={10,15,40};
    for(int i: arr) {
    	System.out.print(i);
    }
    
    
    List<Integer> Student= new Vector<>();
    Student.add(10);
    Student.add(20);
    Student.add(30);
    
    Student.forEach(e->System.out.println(e));
    
    String[] arr1=new String[] {"DELL","LENOVO","HP","APPLE"};
    List<String> stdstack= new Stack<>();
    stdstack=Arrays.asList(arr1);
    
    stdstack.forEach(e->System.out.println(e));
}
}