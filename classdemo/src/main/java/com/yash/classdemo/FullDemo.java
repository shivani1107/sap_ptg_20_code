package com.yash.classdemo;
import java.util.Scanner;
public class FullDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		if(obj.hasNextInt())
		System.out.println("Range is -214483648 to 2147483647 and its default value is 0");
		else if(obj.hasNextFloat())
		System.out.println("Range is  -3.4e38 to 3.4e38 and its default value is 0.0f");
		else if(obj.hasNextDouble())
		System.out.println("Range is -1.7e308 to 1.7e308 and its default value is 0.0d");
		else 
		System.out.println("");

	}

}
