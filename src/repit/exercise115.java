package repit;

import java.util.Scanner;

public class exercise115 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
			  
			}
			
			//write your code below
		String largestword="";
			int max=0;
			for(int i=0;i<words.length;i++){
			  if(words[i].length()>max){
			           max=words[i].length();
			           largestword=words[i];
			           
			  }
			}
		System.out.println(largestword);
		  
		
		
		
	}
	
}
