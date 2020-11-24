package Day03_variables;

import java.util.Scanner;

public class Println_vs_print {

	
	
	//the only characters we can give for any name is : _ and $

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	   
	    int count=0;
	for(int i=0;i<sentence.length()-3;i++) {
		
		if(sentence.substring(i, i+4).equals("java")) {
			count++;
		}
		
	}
	System.out.println(count);
	 int count1=0;
	
	 for(int j=0;j<sentence.length()-5;j++) {
			if(sentence.substring(j, j+6).equals("python")) {
			count1++;
		}
	}
	
	
	System.out.println(count1);
      
	if (count==count1) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	}
	
}
