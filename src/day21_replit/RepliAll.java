package day21_replit;

import java.util.Arrays;
import java.util.Scanner;

public class RepliAll {

	public static void main(String[] args) {
		
		String str = RevDup("aaaabbbbcccc");
		
	System.out.println(str);
	
		
	}
		public static String RevDup(String str) {
		
			
			
			String RemoveDuplicate="";	
		
	   
	       for(int i=0;i<str.length();i++) {
	    	   if(!RemoveDuplicate.contains(str.substring(i, i+1))) {
	    		   RemoveDuplicate+=str.substring(i, i+1);
	    	   }
	       }
	 
	       return RemoveDuplicate;
	       
	  
		}
		
		
		
	}
	

