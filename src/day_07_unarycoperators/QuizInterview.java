package day_07_unarycoperators;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizInterview {
	
	
	
	public static int[] Solution(int N){

		int[] result = new int[N];

		int sum = 0;

		for(int i=0; i < N-1; i++) {

		result[i] =i;

		sum += i;

		}

		result[N-1] = -sum;

		return result;

		    }
	
	public static void main(String[] args) {
		
		
		//Solution(4);
		System.out.println(Arrays.toString(Solution(9)));
		
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

		ArrayList<Integer> list2 = new ArrayList<>();

		    for(int  each : list1) 

		    if( each < 100)

		    list2.add(each);

		 

		    list1=list2;     

		    System.out.println(list1);
		
	}

}
