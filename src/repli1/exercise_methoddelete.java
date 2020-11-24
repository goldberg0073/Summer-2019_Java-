package repli1;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise_methoddelete {

	
	 public static int[] deleteR(int[] arr,int element) {
                               // 4
			int arr1[]=new int[arr.length-1]; 
		for(int i=0;i<arr.length;i++) {      
			
			if(	arr[i]==element)                            
				 continue;
		 
	         
		}	 
		 
		return arr1;
		
				 	   
	  }//end deleteR

	 public static void main(String[] args) {
	
		 int[]num= {45,56,10,4,5};// length 5
		
		 deleteR(num,10);
		 
		 

		 
		
	 }	 
	}
	 
	 
	 
	 
	 
	

