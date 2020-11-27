package com.yash.classdemo;

import java.util.Scanner;

public class DataFormatTest
{
	public void test() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a double value");
	try {
		double input=sc.nextDouble();
		double x = Double.parseDouble("input");
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		
	}
	}
	
	
	}

