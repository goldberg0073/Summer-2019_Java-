package day24_Javarecap;

import java.util.Scanner;

public class timing {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		 boolean isPremiumCustomer = scan.nextBoolean();
		    int nbooksPurchased = scan.nextInt();
	    //your code here
	 //   if(isPremiumCustomer=true){
	   //     if(nbooksPurchased>=5&&nbooksPurchased<=7){
	     //     System.out.println(nbooksPurchased+1);
	          
	   int freebooks=0;	
	   if(isPremiumCustomer=true) {
		  
			   
		   if(nbooksPurchased >=5&& nbooksPurchased<=7) {
	   for (nbooksPurchased=5;nbooksPurchased<=7;nbooksPurchased+=5) {
		   
		  
			freebooks+=1;
			System.out.println("freebook is "+freebooks);
		    break;		
		
		
		   }
	   
		     
		   }
		   else if (nbooksPurchased>=8) {
			   
			   for (nbooksPurchased=8;nbooksPurchased<=100;nbooksPurchased+=8) {
				   
					  
					freebooks+=2;
					System.out.println("freebook is "+freebooks);
				    	
		   }
		   
		   
	   
	   }
	
	
	
	
	
	}
	
	
	}}
