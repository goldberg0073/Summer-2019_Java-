package Day21replit;

import java.util.Scanner;

public class replitweekends {

	public static void main(String[] args) {
		
		
	
		Scanner input =new Scanner(System.in);
		String word=input.next();
        int numword=word.length()/2;		
	    int numindex=(word.length()-1)/2;
        char L=word.charAt(numindex);
        char M=word.charAt(0);
     
     
	    String str=""+word.charAt(numword-1)+word.charAt(numword);
        
	       
        if(numword==1)  { System.out.println(M);}
				
		
        
        else if (numword%2!=0&&numword!=1)  {   System.out.println(L);} 
			
        
		else if (numword%2==0&&numword!=2) {
		System.out.println(str);}
				
			
		else {
		System.out.println(word.concat(word));} 
        
       
			 
        
        
        
        
	     }
				

}


	