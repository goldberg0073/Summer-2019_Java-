package repit;

import java.util.*;

public class exercice153 {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    String[] words = new String[size];
		    for(int i=0; i < size; i++){
		      words[i] = scan.next();
		    }
		    printUniqueWords(words);
		  }
		  
		  public static void printUniqueWords(String[] words){
		    //WRITE YOUR CODE HERE
		for(int j=0;j<words.length;j++) {
			  int count=0;
			  for (int i=0;i<words.length;i++) {
			 if(words[i].equals(words[j])) {
				 count++;
			 }
		   
			  }
			  
				if(count==1) {
					System.out.println(words[j]);
				}
	
		  }
		 
		  
		  
		  }}
	
	
	

