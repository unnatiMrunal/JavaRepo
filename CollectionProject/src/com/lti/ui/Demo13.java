package com.lti.ui;
import java.util.*;
import com.lti.bean.*;
public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Account> aset = new TreeSet<Account>();
		
		Comparator nc = new NameComparator();
		Set<Account> aset = new TreeSet<Account>(nc);
		
		/*
		Comparator bc =new BalanceComparator();
		Set<Account> aset = new TreeSet<Account>(bc);
		*/
		aset.add(new Account(444,"RAM",25000));
		aset.add(new Account(222,"SHAM",2200));
		aset.add(new Account(333,"Abdul",35000));
		aset.add(new Account(111,"Durga",123000));
		
		
		for(Account o:aset)
		{
			System.out.println(o);
		}
	}

}
