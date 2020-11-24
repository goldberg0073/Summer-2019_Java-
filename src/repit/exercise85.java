package repit;

import java.util.Scanner;

public class exercise85 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";             //arr
		String countinue = "";
		double price = 0;             //arr2
		int count = 1;
		double totalPrice = 0;
	

		do{
		  System.out.println("Enter Item" +count + " and its price:" );
		  
		  item = scan.next();
		  price = scan.nextDouble();
		  
		  totalPrice += price;
		  shoppingListReport += "Item"+count+": "+item+" Price: " + price;
		  
		  System.out.println("Add one more item?");
		  countinue = scan.next();
		  if(countinue.equals("yes")){
		    shoppingListReport +=", ";
		  }
		  
		  count++;
		}while(countinue.equals("yes"));
		
		
		System.out.println(shoppingListReport);
		System.out.println("Total price: " +totalPrice);
	
	
	}



}
