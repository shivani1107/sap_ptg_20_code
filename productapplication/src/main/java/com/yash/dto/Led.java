package com.yash.dto;

import java.util.ArrayList;
import java.util.Scanner;

import com.yash.dao.IProduct;

public class Led extends Product implements IProduct {
	ArrayList<Product>mob=new ArrayList<>();
	String name="Mobile";
    String pname="";
	int quantity;
	double price=20000;
Scanner sc=new Scanner(System.in);
public Led(int quantity) {
	quantity=quantity;
}
	public Led(String name, double price, String company) {	
	this.name=name;
	this.price=price;
	this.company=company;
}

	@Override
	public void getDetails() {
		//ArrayList<Product>mob=new ArrayList<>();
				System.out.println("Enter company name:");
				company=sc.next();
			//	System.out.println("Enter your desired mobile name:");
				//pname=sc.next();
				Product product=new Mobile(name,price,company);	
				mob.add(product);
				System.out.println(" "+product);
	}
	

	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		
	}

}
