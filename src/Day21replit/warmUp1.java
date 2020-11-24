package Day21replit;

import java.util.Scanner;

public class warmUp1 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter first and last name: ");
	
	String firstname=input.nextLine();
	           firstname= firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
	
	
//	System.out.println("first name is:"+firstname);
	           
	String lastname=input.nextLine();
	    lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();
//	System.out.println("lastname is : "+lastname);
 
	    String fullname=firstname+" "+lastname;
              System.out.println(fullname);	
	
            
}
	
	
}
