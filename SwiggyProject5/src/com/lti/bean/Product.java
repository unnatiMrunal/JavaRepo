package com.lti.bean;
public class Product {
		private int pid;
		private String pname;
		private double price;
	
		 public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public double getPrice() {
			return price=10;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public Product() {
			// TODO Auto-generated constructor stub
			pid = 1;
			pname = "Food";
			price = 1.0;
		}
		
		public Product(int pid, String pname, double price) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.price = price;
		}
		public void finalize() {
			System.out.println("Destructor: "+pid);
		}
		public String display() {
			 String s="\nProduct ID: " +pid+"\nProduct Name: " +pname +"\nProduct Price: " +price;
			return s;
		 }

}
