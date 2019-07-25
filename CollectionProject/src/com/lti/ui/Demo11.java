package com.lti.ui;
import java.util.*;
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m=new HashMap<String,String>();
		m.put("'Rancho","Amir khan");
		m.put("'Raju","Sharman");
		m.put("'Chatur","Abc");
		int size=m.size();
		System.out.println("No of key,value pairs " +size);
		System.out.println(m);
		m.put("Chatur", "OMI");
		size=m.size();
		System.out.println("No of key " +size);
		System.out.println(m);
	}

}
