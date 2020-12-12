package com.yash.dto;

public  class Product {
	int pid;
	String name;
	double price;
	String company;
	String pname;
	public Product() {
		
	}
	public Product(String name,double price,String company,String pname) {
		this.name=name;
		this.price=price;
		this.company=company;
		this.pname=pname;
	}
		
	public String toString() {
		return "NAME= "+name+" ,PRICE= "+price+" ,COMPANY= "+company+" PRODUCT NAME= "+pname;
		}

}
