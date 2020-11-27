package labassignments;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String args[])
	{
	float rate,time,principal,si;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter principal amount");
	principal=obj.nextFloat();
	System.out.println("Enter rate of interest");
	rate=obj.nextFloat();
	System.out.println("Enter number of years");
	time=obj.nextFloat();
	si=(rate*time*principal)/100;
	System.out.println("This is the required simple interest for given data= "+si);
	}
}
