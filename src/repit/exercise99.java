package repit;

import java.util.Scanner;

public class exercise99 {

	
	
	public static void main(String[] args) {
		
		
	   Scanner scan = new Scanner(System.in);
	    String str = scan.next();      // xxxabcxxxdefxxxxgh
	    int count = 0 ;
	    //WRITE YOUR CODE HERE
	 
	    for(int i=0;i<str.length()-2;i++) {
	    	if(str.substring(i,i+1).equals(str.substring(i+1, i+2))&&str.substring(i+1, i+2).equals(str.substring(i+2,i+3))) {
	    	             //    0,1 ==  1,2                and                  1,2   ==  2,3            
	    		
	    		count++;
	    		
	   
	    	}
	   
	    
	    }
	
	    System.out.println(count);
	

	
	}
	
		
	}

