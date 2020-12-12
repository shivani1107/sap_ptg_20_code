package com.yash.productapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.yash.dto.Led;
import com.yash.dto.Mobile;
import com.yash.dto.Refrigerator;

public class App 
{
    public static void main( String[] args )
    {
        int flag = 0;
    	String pname="";
    	String company="";
    	Scanner sc=new Scanner(System.in);
    	System.out.println("WELCOME IN PRODUCT APPLICATION");
    	System.out.println("Enter given number for your desired product:\n1. Mobile\n2.LED\n3.Refrigerator");
    	int choice=sc.nextInt();
    	if(choice==1) pname="Mobile";
    	else if(choice==2) pname="LED";
    	else if(choice==3) pname="Refrigerator";
    	else {System.out.println("Kindly enter valid number for your product");}
    	System.out.println("How many "+pname+" do you want to purchase?");
		int quantity=sc.nextInt();
		
		
		do {
    	switch (choice) {
		case 1:
			
				Mobile mobile[]=new Mobile[quantity];
				for(int i=0;i<quantity;i++) {
				mobile[i]=new Mobile(quantity);
				mobile[i].getDetails();
					}
				for(int i=0;i<quantity;i++) {
					mobile[i].setDetails();
						}
				
			System.out.println("Do you want more products?\n"
					+ "Enter 1 if you want to continue.\n"
					+ "Enter 0 if you do not want to continue.");
			flag=sc.nextInt();
			break;
			
		
        case 2:
        	for(int i=0;i<quantity;i++) {
        		Led led[]=new Led[quantity];
        		led[i].getDetails();
        		}
        	System.out.println("Do you want more products?\n"
        			+ "Enter 1 if you want to continue.\n"
        			+ "Enter 0 if you do not want to continue.");
			flag=sc.nextInt();
			break;
			
			
       case 3:
    	   for(int i=0;i<quantity;i++) {
    		   Refrigerator frige[]=new Refrigerator[quantity];
    		 frige[i].getDetails();
    		   }
    	   System.out.println("Do you want more products?\n"
    	   		+ "Enter 1 if you want to continue.\n"
    	   		+ "Enter 0 if you do not want to continue.");
			flag=sc.nextInt();
    	
			break;


		default:
			System.out.println("Kindly enter valid number for your product");
			 System.out.println("Do you want more products?\n"
		    	   		+ "Enter 1 if you want to continue.\n"
		    	   		+ "Enter 0 if you do not want to continue.");
					flag=sc.nextInt();
			break;
			
		}
    }while(flag==1);
	
}
    
}