package day21_replit;

import java.util.Arrays;

public class reviewAll {

	
	public static void main(String[] args) {
		
	String []str= {"raja","java","raja","raja","python"};
	
	for (int j=0;j<str.length;j++) {
		int count=0;
	for(int i=0;i<str.length;i++) {
		if(str[i].equals(str[j])) {             
			count++;
		}
		
		
	}
	
	if(count==1) {
		System.out.println(str[j]);
	}
	
	
	
	}	
	
	
	}
	
	}
	
	
	

