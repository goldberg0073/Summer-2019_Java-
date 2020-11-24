package multiDimensielArray;

import java.util.Arrays;

public class ArraysReview_MultiDimensional {

	
	
	public static void main(String[] args) {
		
		
		/*
		 n dimensional array:contains (n-1) dimensional arrays
		 */
		
		int[]arr1D= {1,2,3};
		int[][]arr2D= { { 1,2,3 }, { 4,5,6 } };
		
		System.out.println(arr2D.length);//2
		System.out.println(arr2D[0][1]);    //2
		System.out.println(Arrays.toString(arr2D[1]));
		
		System.out.println(Arrays.deepToString(arr2D));

	String [][] names= {{"denis","raja","hicham"},{"muhtar","david","mike"}  };
	for (String[] each1D:names) {
		System.out.println(Arrays.toString(each1D));
	}
	
	
	
	
	
	
	}
	
}
