package day21_inclass;

import java.util.Scanner;

public class Warmup {
	
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.println("Enter your number");
			int inputnum=input.nextInt();
			sum+=inputnum;
		}
		System.out.println("sum of the numbers:"+sum);
		
		
	}

}
