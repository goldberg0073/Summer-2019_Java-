package Day21replit;

import java.util.Scanner;

public class practiceReplit {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your first and last name");
		String firstname=input.nextLine();
		String lastname=input.nextLine();
  //      String initials = firstname.substring(0,1).concat(".")+lastname.substring(0,1);
              
	
	         String initials=""+firstname.charAt(0)+"."+lastname.charAt(0);
	         initials=initials.toUpperCase();
	         System.out.println("initials is : "+initials);
	
	}
}
