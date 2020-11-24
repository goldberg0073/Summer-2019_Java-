package repit;

import java.util.Arrays;
import java.util.Scanner;

public class replitExercise151 {

	public static void main(String[] args) {
		
		
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
		  }
		  
		  public static void printUniqueNumbers(int[] nums){
		    //WRITE YOUR CODE HERE
		    
		   
	   Arrays.sort(nums);                                        // 0 1 2 3
	   int i=0;
		while( i<nums.length) {
	    	if(nums[i]!=nums[i+1]) {
	    		System.out.println(nums[i]);
	    		break;
	    	}
	       i=i+2;
		}
		
		
		
	   
			  
			  
			  
		
	}
	
	
	
	
}
