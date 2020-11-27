import java.util.Scanner;

public class PizzaAppApplicationStartup {
public static String pizzaName;
public static String size;
public static String crust;
public static String toppings;
public static double price;
public static int pizzaNum=0;
public static int sizeNum=0;
public static int crustNum=0;


	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number for a pizza you want to order:\n1-->DELUX_VEGGLE\n2-->VEG_EXTRAVAGENGA\n3-->IDLI_TANDOORI\n4-->FARMHOUSE_REGULAR\n5-->PEPPY_PANEER\n6-->MEXICAN_GREEN_WAVE\n");
		pizzaNum=obj.nextInt();
		switch(pizzaNum) {
		case 1:
			pizzaName="DELUX_VEGGLE";
			break;
		case 2:
			pizzaName="VEG_EXTRAVAGENGA";
			break;
		case 3:
			pizzaName="IDLI_TANDOORI";
			break;
		case 4:
			pizzaName="FARMHOUSE_REGULAR";
			break;
		case 5:
			pizzaName="PEPPY_PANEER";
			break;
		case 6:
			pizzaName="MEXICAN_GREEN_WAVE";
			break;
		default:
				{System.out.println("You have not selected any of the above pizza name");
				return;
				}
			
		}
		
		System.out.println("Choose size of pizza(1-Medium |2-Regular |3-Small)\n");
		sizeNum=obj.nextInt();
		switch(sizeNum) {
		case 1:
			size="Medium";
			break;
		case 2:
			size="Regular";
			break;
		case 3:
			size="Small";
			break;
			
		default:
			{
				System.out.println("You have not selected any of the above pizza size");
			return;
			}
			
		}
		
		System.out.println("Choose crust if you want of pizza\n1-->NEW_HAND_TOSSED\n2-->CHEESE_BURST\n3-->FRESH_PAN_PIZZA\n4-->CLASSIC_HAND_TOSSED\n5-->WHEAT_THIN_CRUST\n6-->None)");
		crustNum=obj.nextInt();
		switch(crustNum) {
		case 1:
			crust="NEW_HAND_TOSSED";
			break;
		case 2:
			crust="CHEESE_BURST";
			break;
		case 3:
			crust="FRESH_PAN_PIZZA";
			break;
		case 4:
			crust="CLASSIC_HAND_TOSSED";
			break;
		case 5:
			crust="WHEAT_THIN_CRUST";
			break;
		case 6:
			crust="None";
			break;
			
		default:
				System.out.println("You have not selected any of the above size\n");
			
		}

		System.out.println("Choose crust of pizza");
		crust=obj.nextLine();
		
		orderpizza(pizzaName, size, crust);
		displayOrder(pizzaName, size, crust, price, toppings);
		}
	
	
	
	
	
	
	
	private static void orderpizza(String pizzaName,String size,String crust) {
		if(size.equals(PizzaConstants.REGULAR_SIZE_PIZZA)) 
		{
		 if(pizzaNum==1)
			price=PizzaConstants.DELUX_VEGGLE_REGULAR_PRICE;
		else if(pizzaNum==2)
			price=PizzaConstants.VEG_EXTRAVAGENGA_REGULAR_PRICE;
		else if(pizzaNum==3)
			price=PizzaConstants.IDLI_TANDOORI_REGULAR_PRICE;
		else if(pizzaNum==4)
			price=PizzaConstants.FARMHOUSE_REGULAR_PRICE;
		else if(pizzaNum==5)
			price=PizzaConstants.PEPPY_PANEER_REGULAR_PRICE;
		else
			price=PizzaConstants.MEXICAN_GREEN_WAVE_REGULAR_PRICE;
		   
		}
		else if(size.equals(PizzaConstants.MEDIUM_SIZE_PIZZA)) 
		{
		 if(pizzaNum==1)
			price=PizzaConstants.DELUX_VEGGLE_MEDIUM_PRICE;
		else if(pizzaNum==2)
			price=PizzaConstants.VEG_EXTRAVAGENGA_MEDIUM_PRICE;
		else if(pizzaNum==3)
			price=PizzaConstants.IDLI_TANDOORI_MEDIUM_PRICE;
		else if(pizzaNum==4)
			price=PizzaConstants.FARMHOUSE_MEDIUM_PRICE;
		else if(pizzaNum==5)
			price=PizzaConstants.PEPPY_PANEER_MEDIUM_PRICE;
		else
			price=PizzaConstants.MEXICAN_GREEN_WAVE_REGULAR_PRICE;
		   
		}
		else
		{
		 if(pizzaNum==1)
			price=PizzaConstants.DELUX_VEGGLE_LARGE_PRICE;
		else if(pizzaNum==2)
			price=PizzaConstants.VEG_EXTRAVAGENGA_LARGE_PRICE;
		else if(pizzaNum==3)
			price=PizzaConstants.IDLI_TANDOORI_LARGE_PRICE;
		else if(pizzaNum==4)
			price=PizzaConstants.FARMHOUSE_LARGE_PRICE;
		else if(pizzaNum==5)
			price=PizzaConstants.PEPPY_PANEER_LARGE_PRICE;
		else
			price=PizzaConstants.MEXICAN_GREEN_WAVE_LARGE_PRICE;
		   
		}
	}
	
	
	
	
	
	private static void displayOrder(String pizzaName,String size,String crust, double price,String toppings) {
		System.out.println("pizza name :"+pizzaName);
		System.out.println("size :"+size);
		System.out.println("crust :"+PizzaConstants.NEW_HAND_TOSSED_CRUST);
		System.out.println("prize :"+price);
		System.out.println("toppings :"+PizzaConstants.DELUX_VEGGLE_TOPPING);
	}
		

}
