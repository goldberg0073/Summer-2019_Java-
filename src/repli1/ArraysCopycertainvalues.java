package repli1;

import java.util.Arrays;

public class ArraysCopycertainvalues {

	
	
	
	public static void main(String[] args) {
	    
		
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
		  int count=0;
		 String withE="";
		 
		 // String []fewValues=new String[count];
		 
		// String []fewValues=new String[count];
		 
		  for(int i=0;i<arr.length;i++) {
	    	
			  if( arr[i].contains("e")) {
				 withE+=arr[i]+",";
				  count++;
				  	  }
			 
		  }
		  String []fewValues = withE.split(",");
		//  for(String each:fewValues) {
		//	  System.out.println(each);
		  //}
		 // System.out.println(withE);
		  //System.out.println(count);
		    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	
	  
	  
	  
	  }
	  
	  
	  
	
	
	
}
