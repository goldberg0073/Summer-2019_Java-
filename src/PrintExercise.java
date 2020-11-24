import java.util.Scanner;

public class PrintExercise {
    public static void main (String[] args) {
    	
Scanner scan=new Scanner(System.in);
String email = scan.nextLine();
       

           String str =email.substring(0,email.indexOf("_"));

           
           System.out.println("First name: "+str.replaceFirst(str.substring(0, 1), str.toUpperCase().substring(0,1)));

           String str2=email.substring(email.indexOf("_")+1, email.indexOf("@"));



System.out.println("Last name: "+str2.replaceFirst(str2.substring(0, 1), str2.toUpperCase().substring(0,1)));





System.out.println("Domain: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
System.out.println("Top-Level Domain: "+email.substring(email.indexOf(".")+1));

  
    
    }
	

	
}
