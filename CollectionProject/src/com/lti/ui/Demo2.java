package com.lti.ui;
import java.util.ArrayList;
import com.lti.bean.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Account> alist=new ArrayList<Account>();
		alist.add(new Account(111,"Ram",25000.00));
		alist.add(new Account(522,"Sham",22000.00));
		alist.add(new Account(333,"Ganesh",10000.00));
		alist.add(new Account(444,"Vishnu",28000.00));
		alist.add(new Account(789,"Mahadev",13000.00));
		alist.add(new Account(313,"Saraswati",19000.00));
		for(Account a:alist)
		{
			System.out.println( a); 	//toString();
		}
	}

}
