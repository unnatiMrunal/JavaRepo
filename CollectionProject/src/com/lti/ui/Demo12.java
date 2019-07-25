package com.lti.ui;
import java.util.*;
import com.lti.bean.*;
public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mobile number acts as key
		Map<Long,Account> paytm=new HashMap<Long,Account>();
		paytm.put(new Long(9757446510L),new Account(100,"Mru",125478)); //This is a traditional method of passing the wrapper class object.Instead of doing that we can directly pass since JDK 1.5
		paytm.put(9898989898L,new Account(101,"Unna",555555));
		paytm.put(7878787878L,new Account(102,"Bhaka",111111));
		//get(Key);
		//retrieving account of mobile key 1212121212
		Account ob=paytm.get(9898989898L);
		
		System.out.println(ob);
		System.out.println("====================================");
		Set<Long> mobilekeys = paytm.keySet(); 	// It retrieves all keys into set
		Iterator<Long> it = mobilekeys.iterator();
		while(it.hasNext())
		{
			Long key = it.next();
			Account value = paytm.get(key);
			System.out.println(key+" ===> "+value);	
		}
		
		
	}

}
