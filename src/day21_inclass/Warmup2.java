package day21_inclass;

import java.util.Scanner;

public class Warmup2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int max=0;
		for(int i=1;i<=5;i++) {
			System.out.println("Enter a number");
			int inputnum=input.nextInt();
			if(inputnum>max) {
				max=inputnum;
			}
		
		}
	       System.out.println("max value is :"+max);
	
	
	}
}
