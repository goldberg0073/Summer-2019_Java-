package repit;

import java.util.Scanner;

public class exercise95 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);   //01234 56789 10 11 12
	     String str = scan.next();               //bread jambr e  a  d
	  
	                                          //01234                   // 12-4=6
	//   String str1=  str.substring(str.indexOf(("bread")+5),str.lastIndexOf("bread")-4);
	   
	                                   // index 0+5=5  ,       12-4=8                        
	   
		
	   System.out.println(str.indexOf("bread"+4));
	   System.out.println(str.lastIndexOf("bread")-4);
	  // System.out.println(str1);
		
		
		
		
		
		
	}
	
	
}
