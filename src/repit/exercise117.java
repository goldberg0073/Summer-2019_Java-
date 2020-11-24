package repit;

import java.util.Arrays;

public class exercise117 {

	public static void main(String[] args) {
		
		
		
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {       // check each object (string) of the array "arr" if contains "e" 
	                                                       // store arr[i] with "e" in fewValues string and then converte it tp array
	    //TODO : YOUR CODE GOES HERE ----------------------    // using split method
	     String  fewValues="";
	    
	    for(int i=0;i<arr.length;i++){              //i<5
	      if(arr[i].contains("e")){          //arr[0]=zero    arr[1]=one    arr[2]=two    arr[3]=three    arr[4]=four  
	        fewValues+=arr[i]+",";
	        
	      }
	    }
	 
	    String[] getwithE=fewValues.split(",");
	    // System.out.println(fewValues);
	   
	   
	    
	    return getwithE;
		
		
	    
	    
	    
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    
		
	}
	
}
