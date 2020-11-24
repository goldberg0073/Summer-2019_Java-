package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class InterviewQuestion1 {

//Sorting An Array 
	public static int[] Sort(int[] a) {

		ArrayList<Integer> list=new ArrayList<Integer>();

		// Add the values of the array "a" to the empty List of array "list"
		for(int each: a)

		list.add(each);

		 
		for(int i=0; i < a.length; i++) {

		a[i] = findMin(list);
        // remove the values of the array List "list" and put them in the array int[]a
		list.remove(Integer.valueOf(a[i]));
        
		}

		return a;

		}

		public static int findMin(ArrayList<Integer> a) {

	    //Create a method to return the min of an array List
		// first create the constant min	
		int min =Integer.MAX_VALUE;//A constant holding the maximum value of an int 	
		
		for(int each: a)
        // call the method Math.min();
		min=Math.min(min, each);  // Return the smaller of 2 int values
		

		return min;

		}
	
	public static void main (String[]args) {
	
		ArrayList<Integer>num=new ArrayList<>(Arrays.asList(200,50,60,90,100,178));
		int minOfList=findMin(num);
		System.out.println(minOfList);
		
		
		
		
		
		int []arr= {100, 12,15,17,19,30,2,6,9};
		
		int []arrSorted=Sort(arr);
		for(int each:arrSorted) {
			System.out.print(each+",");
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
	}
	
	
}
