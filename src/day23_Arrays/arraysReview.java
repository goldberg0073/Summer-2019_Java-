package day23_Arrays;

import java.util.Arrays;

public class arraysReview {

	public static void main(String[] args) {
		
	
		int arr5[]= {2,4,8,9,12,999,192,380};
		int max5=Integer.MIN_VALUE;//-2147483647
		for(int each:arr5) {
			if(each>max5) {
				max5=each;
			}
		}
		
		System.out.println(max5);
		
		
		
		
		
		
		int[] Numbers = { 9, 8, 100, 3000, 4, 5, 6};
	
	//find maximum value in the array    sort in ascending order to print out the last index(max)
		Arrays.sort(Numbers);    
	
		
		for(int each:Numbers) {
			System.out.print(each+" ");
		}
		System.out.println();
		
		int max=Numbers[Numbers.length-1];
		System.out.println(max);
	

		System.out.println(maxValue(Numbers));
		
       
		
		int[]  MyNumbers = { 99,10,200, 3000, 40, 50, 5000};
	    Arrays.toString(Numbers);    //method to print out the arrays as a whole string value
		// if we want to print every single value of the array we use each loop or for loop 
	    
	    
	    // MyNumberw -> [10, 40, 50, 99, 200, 3000, 5000]
//						  0   1   2   3   4    5      6

System.out.println( Arrays.toString(MyNumbers) );

String result ="[";
for(int i = MyNumbers.length-1; i  >= 0; i--) {
	
	 result += MyNumbers[i] +", " ;
	
}
		System.out.println();
		
result = result.substring(0, result.length()-2)+"]"; // descending order
		
		System.out.println(result);
		

		String emailAddress ="Cybertek.school.bacth12@Gmail.com";
			emailAddress =  emailAddress.substring(0, emailAddress.indexOf("@") );
			String[] array = emailAddress.split("\\.");
			
			System.out.println(Arrays.toString(array));
		
		
		
		int []arr= {1,24,9,36,437,83,7,5,3,53};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		Arrays.fill(arr, 99);
		for(int each:arr) {
			System.out.print(each+",");
		}
			
		
		System.out.println();
		
		int []arr1= {8,72,696,27,57,47,57,47};
		int []arr2 = new int [10];
		
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		
		arr2[8]=99;
		arr2[9]=99;
		for(int each:arr2) {
			System.out.print(each+",");
		}
		
	
	}


	

	public static int maxValue(int[]n) {

        int max1 = Integer.MIN_VALUE;
         
		for(int each: n)

		if(each > max1)

		max1 = each;
		 

		return max1;
		
		}


}