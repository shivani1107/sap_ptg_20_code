package com.yash.classdemo;

public class Rectangle extends Square {
private double b;
	Rectangle(double x,double y) {
		super(x);
		b=y;
	}
void area() {
	System.out.println("Area of rectangle="+(l*b));
}
}
