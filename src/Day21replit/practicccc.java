package Day21replit;

import java.util.Scanner;

public class practicccc {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word=input.nextLine();
				
		int position;
		int length;
	    
		if(word.length()%2==1) {
			position=word.length()/2;
			length=1;
			
			if(word.length()==1) { System.out.println(""+word.charAt(0)+word.charAt(0)+word.charAt(0));
				
			}
			else {System.out.println(word.substring(position, position+length));
				
			}
		}
		else {
			position=word.length()/2 -1;
			length=2;
			
			if (word.length()==2) {
				System.out.println(word.concat(word));
			}
			else {
				
				System.out.println(word.substring(position, position+length));
			}
		
	        
	
}
}}