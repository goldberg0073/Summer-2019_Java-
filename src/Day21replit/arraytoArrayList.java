package Day21replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class arraytoArrayList {

	public static void main(String[] args) {
		
		
		int[]arr= {1,2,3,4,5};
		
		
		for(int each:arr) {
		   System.out.print(each);	
		}
		String str =Arrays.toString(arr);
		
		System.out.println();
		
		System.out.println(str);
		String strarray[]=str.split(",");

	   for(String each1:strarray) {
		   System.out.print(each1);
	   }
		
		System.out.println();
	   
	   ArrayList<String>list = new ArrayList<>(Arrays.asList(strarray));
	     
		
	       list.add(strarray.length,"6");
	

			for(String each:list) {
				System.out.print(each);
			}
	}
	
	
	
	
}
