package dao;

import java.util.Scanner;

public interface IRefrigerator 
{
	Scanner sc=new Scanner(System.in);
	public static final double price = 40000;
	public static String company = "";
	default void getInfo()
	{
		System.out.println("Enter company name of product ");
		String company=sc.next();
	}
	default void setInfo()
	{
		System.out.println("Name of product is Refrigerator and Company name is "+company+" and price of product is "+price);	
		
	}
}
