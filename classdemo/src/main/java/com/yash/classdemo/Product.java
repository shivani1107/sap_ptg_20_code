package com.yash.classdemo;

public abstract class Product {
	String name;
	static double price;
	String company;
	public Product() 
	{
		System.out.println("Enter product name:"+name);
	}
 /*   public Product(String name,double price) 
    {
    	this.name=name;
    	this.price=price;
		
	}
    public Product(String name,double price,String company) 
    {
    	this.name=name;
    	this.price=price;
    	this.company=company;
		
	}*/
/*	void details() {
		System.out.println("overloading");
	}
	void details(String name) {
		this.name=name;
		System.out.println("overloading:-->"+name);
	}
	*/
    abstract void productdetails() ;

}
