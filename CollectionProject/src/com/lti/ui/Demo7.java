package com.lti.ui;
import com.lti.bean.*;
import java.util.*;
// Updated code of Demo6
public class Demo7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Account> col=new HashSet<Account>(); 	// As we have mentioned datatype/classtype explicitly in "<>" that is why it is call GENERIC DATATYPE
		col.add(new Account(100,"aa",5000.00));
		col.add(new Account(101,"bb",6000.00));
		col.add(new Account(102,"aa",8000.00));
		col.add(new Account(100,"aa",5000.00));
		
		int size=col.size();
		System.out.println("no of elements" +size);
		System.out.println(col);
	}

}
