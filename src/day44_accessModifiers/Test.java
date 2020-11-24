package day44_accessModifiers;


import static day44_accessModifiers.TestData.Name;
//                 package Name        className.staticName

import java.util.Arrays;

import static day44_accessModifiers.TestData.ID;

import static day44_accessModifiers.TestData.*;   // we use this because its more convenient ===> able to access all static variable

import static day44_accessModifiers.TestData.printHello;
public class Test {
	
	public static String Name ="Muhtar";
	public static void main(String[] args) {
		
		
		
		System.out.println(Name);   
		System.out.println(TestData.Name);
		System.out.println(ID);
	    System.out.println(school);
	
	   System.out.println(age); // the same package
	    
	    
	    
	    int[]numbers= {1,2,3,5};
	    Arrays.toString(numbers);
	    
	    
	   
	    
	
	}

}
