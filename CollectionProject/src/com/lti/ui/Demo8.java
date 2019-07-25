package com.lti.ui;

import java.util.*;
// Updated code of Demo3
public class Demo8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<String> col=new HashSet<String>(); 	// As we have mentioned datatype/classtype explicitly in "<>" that is why it is call GENERIC DATATYPE
		//Set<String> col=new LinkedHashSet<String>();
		Set<String> col=new TreeSet<String>();	// Unordered sequence // no duplicate // no null 
		// Elements are sorted in natural order
		col.add("Ram");
		col.add("Sham");
		col.add("Ganesh");
		col.add("Ram");
		//col.add(null);
		//col.add(null);
		//col.add(100); 	//Error as it's datatype is not matching with the datatype of collection
		int size=col.size();
		System.out.println("no of elements" +size);
		System.out.println(col);
	}

}
