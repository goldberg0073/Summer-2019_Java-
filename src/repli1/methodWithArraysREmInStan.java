package repli1;

import java.util.ArrayList;
import java.util.Arrays;

public class methodWithArraysREmInStan {
	
	 public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {
		
			while  (r.contains(n))  {           
					//0=>1  ==1
					//1=>1  ==1
					//2=>2  !=1
					//3=>3  !=1
					r.remove(n);
					 
			        }		
				   

			return r;
		   
		   
		  }
		  
	public static void main(String[] args) {
		
		    ArrayList<Integer>  arr = new ArrayList<>();
		    Integer[] nums = new Integer[]{1,1,2,1,1,3,1};
		    arr.addAll(Arrays.asList(nums));
		    
		    System.out.print(removeInst(arr,1));
		   
		    
		    
		    
		  }//end main
}
