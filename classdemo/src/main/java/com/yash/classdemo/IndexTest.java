package com.yash.classdemo;

import java.util.Scanner;

public class IndexTest {
	
public void test() 
{
	Scanner sc=new Scanner(System.in);
	String fname[]= {"A","B","C","D","E","F","G","H","I","J"};
	System.out.println("Enter a number for your name");
	int num=sc.nextInt();
	System.out.println("Your first name for requested name is "+fname[num-1]);	
	try 
	{
		if(num>10);
			
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.toString());
	}
}
}
