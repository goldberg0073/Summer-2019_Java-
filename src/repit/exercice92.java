package repit;

import java.util.Scanner;

public class exercice92 {

	
	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
		    int n = scan.nextInt();
		    int fractional=0;
		    
		     
		    	//for(int i=n;i>0;i--){  //5 4 3 2 1
		       
		    	int i=0;
		    	do { fractional=n*(n-i);
		    	i--;		
		    	 	
		     }
		    	
		    	while (n<i);
		    	
		  //  }
		    	System.out.println(fractional);
		   
		    
		    
		
	}
	
}
