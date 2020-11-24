package repit;

import java.util.Scanner;

public class exercise101 {

	public static void main(String[] args) {
		
		
		  
		 Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   

		    //TODO: Write your code below
		    
		   //   words[i]==> 0 1 2 3 4      words[0]="hello"               words[1]=apple  words[2]=orange  words[3]=coke  words[4]=peach
		     
		   //                                words[0].substring(0,1).concat(words[0].substring(4,5))  ;                               
		    
		    for(int i=0; i<words.length;i++) {
		    String result= words[i].substring(0,1).concat(words[i].substring(words[i].length()-1, words[i].length()));
		    
		    System.out.println(result);
		    }
		
	
		    
		
		
	}
	
	
	
}
