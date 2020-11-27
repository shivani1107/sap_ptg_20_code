package labassignments;

public class CommandLineArgument {
	 public static void main(String ar[]) 
	    { 
	        if (ar.length > 0) 
	        { 
	            System.out.println("Command line Arguments are: "); 
	            for (String cmd:ar) 
	                System.out.println(cmd); 
	        } 
	        else
	            System.out.println("there is no command line argument"); 
	    } 
}
