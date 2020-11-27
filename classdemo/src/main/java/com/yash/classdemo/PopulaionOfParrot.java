package com.yash.classdemo;

public class PopulaionOfParrot {

	public static void main(String args[]) {
		float pop=1000;//pop is a variable using to define population of parrot
		while(pop<=1500) {//
			pop+=(0.04*pop);
		}
//System.out.println(pop);
		System.out.println( java.lang.Math.ceil(pop));
		/*float pop;
		for(pop=1000;pop<=1500;pop++)
			pop+=(0.04*pop);
System.out.println( java.lang.Math.ceil(pop));*/
	}
}
