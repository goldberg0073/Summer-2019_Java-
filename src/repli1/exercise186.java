package repli1;

import java.util.*;

public class exercise186 {

	
	public static String extractNum(String s) {
		
		
		String extracNum="";
		for(int i=0;i<s.length();i++) {
			
			
			if(Character.isDigit(s.charAt(i))){
			   extracNum+=s.charAt(i);	
			}
			
			
		}
		
		
		
		
		return extracNum;
	    
		   
	  }
	
	public static void main(String[] args) {
		
		String str1="google016565bye";
		System.out.println(extractNum(str1));
		
	}
	
	
}
