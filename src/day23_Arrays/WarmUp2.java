package day23_Arrays;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    
	    for(int i=1;i<=count;i++){
	      count++;
	     for(int j=1;j<count;j++)
	      count++;
	    	
	     System.out.print(word.concat(separator));
	    }
		
	   
		
	    
		
	}
			
				
			}

	
	
	           	
                
	

