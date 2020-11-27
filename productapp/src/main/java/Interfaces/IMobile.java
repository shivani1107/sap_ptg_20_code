package Interfaces;

import java.util.Scanner;

public interface IMobile {
	Scanner sc=new Scanner(System.in);
	public static final double price = 20000;
	public static  String company = "";
	default void getInfo()
	{
		System.out.println("Enter company name of product number ");
		String company=sc.next();
		
	}
	default void setInfo()
	{
		System.out.println("Name of product is Mobile and Company name is "+company+" and price of product is "+price);		
	}

}
