package repit;

import java.util.Scanner;

public class exercise89 {

	
	public static void main(String[] args) {
	   
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();              // hicham     length()=6
	    String separator = scan.next();         // raja    lenght()= 4
	    int count = scan.nextInt();             // 3 
	   
	    
	    String str="";
	    
	     for(int i=1;i<=count;i++){
	        
		      str+=(word+""+separator); // 3 time str ==> lenght =30
		 
	     }                
	   
	     System.out.println(str.substring(0,str.length()-separator.length())); // str.substring(0,30-4)==(0,26)
	                                                                           //hichamrajahichamrajahicham ==> length =26
	}
	}
	

