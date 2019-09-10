package day20_Scanner;

import java.util.Scanner;

public class Quizhelp {
	public static void main(String[] args) {
		
	
		Scanner  input= new Scanner(System.in);
		int  inputseconds = input.nextInt();
		
		
		int hours = (inputseconds/3600)% 3600 ;
		int minutes=(inputseconds/60)%60;
		int seconds=inputseconds-((hours*3600)+(minutes*60));
		
		System.out.println("Enter seconds:\n"+ hours+" hours, "+minutes+" minutes, and "+ seconds+" seconds" );
    
  }

		
		
		
	}


