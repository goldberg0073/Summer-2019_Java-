package repit;

import java.util.Scanner;

public class exercise103 {

	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();        // java is fun
	    String reversed =""; 
	    
	    //TODO: start your code here    
	    
	    String[]  str=  sentence.split(" ");                       

		    for(int i=str.length-1;i>=0;i--){
		       
		       String str1=str[i]+" ";
		         reversed+=str1.replace(str[0]+" ",str[0]+"");
		    }
		    
		    
	    
        
	    
	    
	    //End your code here. do not modify below statement
	    System.out.println(reversed);
		
		
		
	}
}
