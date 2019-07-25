package com.lti.ui;

import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set col=new HashSet();
		col.add("Ram");
		col.add("Sham");
		col.add("Ganesh");
		col.add("Ram");
		col.add(100);
		int size=col.size();
		System.out.println("no of elements" +size);
		System.out.println(col);
	}

}
