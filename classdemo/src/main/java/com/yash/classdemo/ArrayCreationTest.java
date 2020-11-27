package com.yash.classdemo;

import java.util.Scanner;

public class ArrayCreationTest 
{ 
	int size=-8;
Scanner sc=new Scanner(System.in);
	public void test() 
	{ 
		System.out.println("Enter array size");	
				try 
				{
		            size=sc.nextInt();
		            int[] arr=new int[size];
		        }
				catch (NegativeArraySizeException e) 
				{
				    e.printStackTrace();
				}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
}

