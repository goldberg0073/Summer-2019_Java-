package repli1;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Create a static method that:

    is called appendPosSum
    returns an ArrayList of Integers
    takes one parameter: an ArrayList of Integers

This method should:

    Create a new ArrayList of Integers
    Add only the positive Integers to the new ArrayList
    Sum the positive Integers in the new ArrayList and add the Sum as the last element


For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), 
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).
  The original ArrayList should remain unchanged.
 */

public class MethodWithArraysappenPos {
	public static void main(String[] args) {
		
		ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3,7,8,90,-1,6,5,12,100,-5,3,-24));
	              appendPosSum(list1);                     // 0  1 2  3 4 5 6
	         System.out.println( appendPosSum(list1));
	
	}

	
	
	
	public static    ArrayList<Integer>     appendPosSum (ArrayList<Integer> list){
	
		Integer sum=0;
	    ArrayList<Integer>list2=new ArrayList<>();
	    
	    for(int i=0;i<list.size();i++) {
	    	
	    	if(list.get(i)>0) {	
	    		
	     list2.add(list.get(i));
	     sum+=list.get(i); 
	     
	    	}
	    }
	     list.add(sum);
	     return list2;
		
		

	}
	
}
