package repli1;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise192 {
	public static void main(String[] args) {
		                                               // 0 1 2  3  4
	ArrayList<Integer>num1=new ArrayList<>(Arrays.asList(3,5,87,34,100));
	      
	
	          timesTwo(num1);
	          
	         System.out.println(num1);
	         
	}

	
	public static  void timesTwo (ArrayList<Integer> num1) {
	
	
	    for(int i=0; i>=num1.size();i++) {
               
	    	num1.get(i);
	    	  System.out.println(num1.get(i)*2);   
	    }
	
	}
	
	
}
