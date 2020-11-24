package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortDescending {

	
	public static int[] Sort(int[]arr) {
		ArrayList<Integer>list=new ArrayList<>();
		//Add the values of the array to the list
		for(int each:arr) {
			list.add(each);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=Max(list);
			list.remove(Integer.valueOf(arr[i]));
		}
		
		
		return arr;
	}

	
	// Create Method that return the max value of an arraylist
	public static int Max(ArrayList<Integer>list) {
		
		int max=Integer.MIN_VALUE;// Hold a constant of the minimum value that an array can have
		for(int each:list) {
			max=Math.max(max, each);//return the bigger of the 2 values
		}
		
		return max;
	}
	
	
	
	
	public static void main (String[]args) {
	    
		int[]arrNum= {12,57,90,473,59,100};
		ArrayList<Integer>lista=new ArrayList<>();
		for(Integer each:arrNum) {
			lista.add(each);
		}
		System.out.println(lista);
		System.out.println(Max(lista));
		int []SortedArr=Sort(arrNum);
		for(int each:SortedArr) {
        System.out.print(each+",");
		}
		
	}
}
