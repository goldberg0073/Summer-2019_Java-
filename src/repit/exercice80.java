package repit;

import java.util.Scanner;

public class exercice80 {

	public static void main(String[] args) {
		
		
		  int freeBooks = 0;
		    Scanner scan = new Scanner(System.in);
		    boolean isPremiumCustomer = scan.nextBoolean();
		    int nbooksPurchased = scan.nextInt();
		    
	
	     if (isPremiumCustomer) {

            freeBooks =(nbooksPurchased>=8)? 2:

                        (nbooksPurchased>=5)? 1:0;

        }

        else {

            freeBooks =(nbooksPurchased>=12)? 2:

                (nbooksPurchased>=7)? 1:0;

        }

        System.out.println(freeBooks);

        
			
		
		
	}
	
	
}
