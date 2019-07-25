package com.lti.bean;
import java.util.Comparator;

public  class NameComparator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		// TODO Auto-generated method stub
		String n1 = o1.getAname();
		String n2 = o2.getAname();
		
		return n1.compareTo(n2);
	}

}
