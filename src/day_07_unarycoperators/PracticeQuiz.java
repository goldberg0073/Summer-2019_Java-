package day_07_unarycoperators;

import java.util.ArrayList;
import java.util.Arrays;



public class PracticeQuiz {
	public static void main(String[] args) {
		
	
	
	
	ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(1,2,4,5,6,43,89,101,200,359));
	ArrayList<Integer>list2=new ArrayList<>();

	for(int each:list1) {
		if(each<100) {
			list2.add(each);
			
			list1=list2;
			
			
		}
	}
	
	System.out.println(list1);
	
	
	


}
}