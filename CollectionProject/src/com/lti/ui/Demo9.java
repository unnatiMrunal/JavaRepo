package com.lti.ui;

import java.util.*;
// Updated code of Demo3
public class Demo9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> col=new HashSet<String>(); 	// As we have mentioned datatype/classtype explicitly in "<>" that is why it is call GENERIC DATATYPE
		col.add("Ram");
		col.add("Sham");
		col.add("Ganesh");
		col.add("Ram");
		//col.add(100); 	//Error as it's datatype is not matching with the datatype of collection
		int size=col.size();
		System.out.println("no of elements" +size);
		System.out.println(col);
		System.out.println("------------------------------------------");
		Iterator<String> it = col.iterator();
		while(it.hasNext())	// Check wether next element exists or not
		{
			String el= it.next(); //retrieve element
			System.out.println(el);
		}
		System.out.println("------------------------------------------");
		for(String s:col)
		{
			System.out.println(s);
		}
	}

}
