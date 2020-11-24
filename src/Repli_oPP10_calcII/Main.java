package Repli_oPP10_calcII;

import java.util.ArrayList;
import java.util.Arrays;

import Repli_oPP10_calcII.calc;
public class Main {
	
	static String name;
	
	static {
		System.out.println("raja first");// static bloc first get executed then the main method
		name="hicham";// static block is used to initialize the static variable
	}
	
	
public static void main(String[] args) {
		
	                                                   //0 1  2 3 4 5 
	ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,3,-5,6,-8,9));
	
	  System.out.println(list);
	  Integer sum=0;
	  ArrayList<Integer>list2=new ArrayList<>();
    for(int i=0;i<list.size();i++) {
    	
    	if(list.get(i)>0) {	
    		
    		list2.add(list.get(i));;
    	    sum+=list.get(i);
    	    
    	}
    }
	  
    System.out.println(list2);
    list2.add(sum);
	 System.out.println(sum); 
	  
	  
        // calc.plus(541,21);
	
     	System.out.println("1+1 = "+ calc.plus(16,196));
		
		
		System.out.println("1-1 = "+ calc.minus(140,70) );
		
	System.out.println(name);
		
		
	}
	

  
}
