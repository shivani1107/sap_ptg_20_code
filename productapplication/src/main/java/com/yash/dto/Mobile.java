package com.yash.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.yash.dao.IProduct;
public class Mobile extends Product implements IProduct {
	
	ArrayList<Product>mobile=new ArrayList<>();
	String name="Mobile";
	int quantity;
	double price;
	int flag;
	String pname;
	String pname_array[]= {"Apple iPhone 12 Mini","Apple iPhone 11 Pro with price=84900","Apple iPhone 7",
			"Sony Xperia XZ2","Sony Xperia L2","Sony Xperia XA2 Ultra",
			"Samsung Galaxy S10 Plus","Samsung Galaxy Note 10 Plus with price=35265","Samsung Galaxy S20 Fan Edition"};
	String key;
	
Scanner sc=new Scanner(System.in);

public Mobile(int quantity) {
	this.quantity=quantity;
}
	public Mobile(String name, double price, String company) {	
	this.name=name;
	this.price=price;
	this.company=company;
}

	
	

	@Override
	public void getDetails() {
		System.out.println("\nEnter company name for your desired "+name);
		company=sc.next();
	    if(company.equals("Apple")) {
	    	System.out.println("Available mobiles in "+company+" are:\n"
	    			+ "1-->Apple iPhone 12 Mini with price=65007\n "
	    			+ "2-->Apple iPhone 11 Pro with price=84900\n"
	    			+ "3-->Apple iPhone 7 with price=24990\n");
	    	System.out.println("Enter number for your desired mobile\n");
	    	int num=sc.nextInt();
	    	key=pname_array[num+1];
	   
	    	
	    	
	    	
	    }
	    
	    
		else if(company.equals("Sony")) {
			System.out.println("Available mobiles in "+company+" are:\n"
    			+ "1-->Sony Xperia XZ2 with price=57900\n"
    			+ "2-->Sony Xperia L2 with price=57900\n"
    			+ "3-->Sony Xperia XA2 Ultra with price=74164\n");
			System.out.println("Enter number for your desired mobile\n");
	    	int num=sc.nextInt();
	    	key=pname_array[num+4];
	    
			}
	    
	    
		else if(company.equals("Samsung")) {
			System.out.println("Available mobiles in "+company+" are:\n"
	    			+ "1-->Samsung Galaxy S10 Plus with price=39999\n"
	    			+ "2-->Samsung Galaxy Note 10 Plus with price=35265\n"
	    			+ "3-->Samsung Galaxy S20 Fan Edition with price=49999\n");
			System.out.println("Enter number for your desired mobile\n");
	    	int num=sc.nextInt();
	    	key=pname_array[num+7];
		}
	    
		else {System.out.println("Not Available...");}
	    
		System.out.println();
		Product product=new Product(name,price,company,pname);	
		mobile.add(product);
	}
	
	
	
	@Override
	public void setDetails() {
	    
		HashMap<String, Double>hash=new HashMap<>();
		hash.put("Apple iPhone 12 Mini",65007.00 );
		hash.put("Apple iPhone 11 Pro",84900.00 );
		hash.put("Apple iPhone 7 ",24990.00 );
		
		hash.put("Sony Xperia XZ2",57900.00 );
		hash.put("Sony Xperia L2",65007.00 );
		hash.put("Sony Xperia XA2 Ultra",74164.00 );
		
		hash.put("Samsung Galaxy S10 Plus",39999.00 );
		hash.put("Samsung Galaxy Note 10 Plus",35265.00 );
		hash.put("Samsung Galaxy S20 Fan Edition",49999.00 );
	  
		//String pname = hash.get("key");  
        //System.out.println("Value is:" + value);  
		for(Product pro:mobile) System.out.println(" "+pro);
	}
}
