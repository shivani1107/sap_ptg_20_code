package com.yash.classdemo;

public class StudentData {
	 private int stuID;
	   private String stuName;
	   private int stuAge;
	   StudentData()
	   {
	       //Default constructor
	       stuID = 100;
	       stuName = "New Student";
	       stuAge = 18;
	   }
	   StudentData(int num1, String str, int num2)
	   {
	       //Parameterized constructor
	       stuID = num1;
	       stuName = str;
	       stuAge = num2;
	   }
	   //Getter and setter methods
	   public int getStuID() {
	       return stuID;
	   }
	   public void setStuID(int stuID) {
	       this.stuID = stuID;
	   }
	   public String getStuName() {
	       return stuName;
	   }
	   public void setStuName(String stuName) {
	       this.stuName = stuName;
	   }
	   public int getStuAge() {
	       return stuAge;
	   }
	   public void setStuAge(int stuAge) {
	       this.stuAge = stuAge;
	   }

}
