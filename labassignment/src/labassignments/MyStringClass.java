package labassignments;
import java.util.Scanner;
public class MyStringClass {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
     MyStringClass obj=new MyStringClass();
     System.out.println("Enter the number of operation which you perform \n"
     		+ "1. Concate the string\n");
     int choice=sc.nextInt();
     if(choice==1)
    	 obj.concatenation();
	}
	public void concatenation() {
		String str1,str2;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the 1st string");
		 str1=sc.nextLine();
		 System.out.println("Enter the 2nd string");
		 str2=sc.nextLine();
		   System.out.println("Concatenated String is ");
		   System.out.println(str1+str2);
	}
    
}
