package repit;

import java.util.Arrays;

public class exercise121 {

	public static void main(String[] args) {
		
		
		String str="volt, olive, fish, hot pursuit, warning, python, java, coffee, part";     
		    
		
		String[]arr=  str.split(", ");     // 
		                                 
		    
		                   
		     int[]length=new int [arr.length];
		     
		     
		     int i=0;
		     for(String each:arr) {                   //
		    	 length[i] = each.length();
		        // length[0]=4
		        // length[1]=3  .....
		    	// length[7]=3         // sort the array arr by length   3 3 3 4 4 5 6
		    	 
		    	 i++;                               
		     }
		     
		   Arrays.sort(length);  // 3 3 3 4 4 5 6
	//	  System.out.println(Arrays.toString(length));
		   Arrays.sort(arr);
	//	   System.out.println(Arrays.toString(arr));
		   String shortest="";                         
		    
		    for(int j=0;j<arr.length;j++) {     // 
		    	if (arr[j].length()==length[0]) {   // Arr[0]=4 <= 4   arr[1]=3<3
		    		
		    		shortest+= arr[j]+",";
		    				
		    	 }
		    	
		     }
	  //     System.out.println(shortest);
		    String[]s=shortest.split(",");
		    System.out.println(Arrays.toString(s));
		    
		    
		    
		    // String shortest1[]=shortest.split(",");
		    // Arrays.sort(shortest1);
		     //System.out.println(Arrays.toString(shortest1));
	
		    
	}
	
	
}
