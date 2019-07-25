package com.lti.ui;
import com.lti.bean.*;
public class Demo {
	
	
	public static void main(String[] args) {
		// Accept product values using Scanner
		Product ob2 = new Product(101,"Vada Pav",50.00);
		// Accept orderid and quantity values using Scanner
		Order order = new Order(111111,ob2,32);
		order.showOrder();
		
	}

}
