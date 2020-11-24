package day_21review;

import java.util.Scanner;

public class Loop_review {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		String original =input.nextLine();
		String reverse ="";
		// largest index 
		for (int i=original.length()-1 ; i>=0 ;i--) {
			reverse+=original.substring(i,i+1);
			
			
		}
		System.out.println(reverse);
	     
	     boolean result = original.equalsIgnoreCase(reverse) ? true : false;
		 System.out.println( result );
	}
	
	
	
}
