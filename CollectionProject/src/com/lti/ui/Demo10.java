package com.lti.ui;
import java.util.*;
// Updated code of Demo3
public class Demo10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<String> col=new HashSet<String>();
		List<String> col=new ArrayList<String>(); 	// As we have mentioned datatype/classtype explicitly in "<>" that is why it is call GENERIC DATATYPE
		col.add("Ram");
		col.add("Sham");
		col.add("Ganesh");
		col.add("Ram");
		//col.add(100); 	//Error as it's datatype is not matching with the datatype of collection
		int size=col.size();
		System.out.println("no of elements" +size);
		System.out.println(col);
		System.out.println("---------------After remove ---------------------------");
		col.remove("Sham");
		System.out.println(col);
		System.out.println("------------------------------------------");
		System.out.println("\nList specific methods:");
		System.out.println("Object at 2 index");
		String s2 = col.get(2);
		System.out.println(s2);
		System.out.println(col);
		col.set(2, "Ganesh");
		System.out.println("After replacing at index 2 "+col);
		col.add(2, "Durga");
		System.out.println("After inserting at index 2 " +col);
		col.remove(3);
		System.out.println("After removing object from index 3 "+col);
		/*
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
		
		*/
	}

}
