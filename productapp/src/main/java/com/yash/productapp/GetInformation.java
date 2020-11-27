package com.yash.productapp;
import java.util.Scanner;
public class GetInformation implements IMobile,IRefrigerator
{
	String name[]=new String[4];
	//String company[]=new String[4];
	int id;
	int flag=0;
	Scanner sc=new Scanner(System.in);
	public void getInfo()
	{
		System.out.println("Enter number of products are you wanting??");
		id=sc.nextInt();
		for(int i=0;i<id;i++)
		{
			System.out.println("Enter name of product number "+(i+1));
			name[i]=sc.next();
				if(name[i].toString().equals("Mobile"))
				{
					IMobile.super.getInfo();
					flag++;
				}
				else if(name[i].toString().equals("Refrigerator"))
				{
					IRefrigerator.super.getInfo();
					if(flag==1)
					{
						IMobile.super.setInfo();
						IRefrigerator.super.setInfo();
					}
					else
					{
						IRefrigerator.super.setInfo();
					}
				}
				else
				{
					return;
				}
				
		}
	}
			
			
		
	@Override
	public void setInfo() {
		// TODO Auto-generated method stub
		//IMobile.super.setInfo();
	}
	}


