package repit;

import java.util.Scanner;

public class exercise119 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int k = 0;          // num of temps 8
		double total = 0;   // sum of temps
		double avgTemp = 0;     //      temps/k
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };          // temperature
		
		
		
		for(int i=0;i<temps.length;i++) {
		         total+=temps[i] ;  
		         k++;
		
		}
	         avgTemp=total/k;
		
		System.out.println(avgTemp);
		
		
		
	}
	
	
}
