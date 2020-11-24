package repit;

import java.util.Scanner;

public class exercise84 {

	
	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
		    int inhabitants = scan.nextInt();
		    int Day=0;
			  
		   if(Day==0&&inhabitants!=0) {
		    System.out.println("Day "+ Day +" ["+inhabitants+"]");
		    }
		    for(int j=0;j<inhabitants/2;j++){
			    for(int i=inhabitants;i>0;i--){
			           
			    	 
		 	     Day++;
		   	      inhabitants=inhabitants/2;
		   	      if(inhabitants>0) {
			             System.out.println("Day "+ Day +" ["+inhabitants+"]");
			            }
			               
		   	      else if(inhabitants<1) {
			       		 
			       	 }
			    }
			    
			    } 
		    System.out.println("---- EXTINCT ----");
	
	} 		
	}

