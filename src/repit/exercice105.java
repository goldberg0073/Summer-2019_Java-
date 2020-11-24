package repit;

import java.util.Arrays;
import java.util.Scanner;

public class exercice105 {
public static void main(String[] args) {
	
	
    Scanner input = new Scanner(System.in);
    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
   // ["muhtar","bob"]
	    //TODO: Write your code below
	   
         // "[m, b]"
	    for(int i=0;i<words.length;i++){
	            
	    	   String str= ( words[i].charAt(0)+""+words[i].charAt(words[i].length()-1)+" ");
	       	
	   	    	System.out.print(str);     

	   	  //  String strarray[]=str.split(" ");
	   	   
	   	    //	System.out.print(Arrays.toString(str.split(" ")));
	    	
	
	    }
	
	 
	    
}

}
