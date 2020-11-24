package day21_inclass;

import java.util.Scanner;

public class warmup3 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int min=99999999;
		for(int i=1;i<=5;i++) {
			System.out.println("Enter the number");
			int inputnum=input.nextInt();
			if(inputnum<min) {
				min=inputnum;
			}
		}
		System.out.println("minimum value is : "+min);
		
	}
	

}
