package repit;

import java.util.Scanner;

public class exercise149 {


		public static void add_to_r(int[] r,int n) 
		{
			//create new array with one more position.
			int[] new_r;                              //  0 1  2 3
			new_r = new int[r.length+1];  //  r size = 4 {1,5,77,8}  new_r size 5 (r size+1)     
		
			
			for(int i=0;i<r.length;i++) {
				new_r[i]=r[i];
			}
							
			new_r[r.length]=n;       //  new_r[4]=n
			
		for(int each:new_r) {
			System.out.println(each);
		}
		
		
		}
	  
	  public static void main(String[] args) {
	    
	    
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt(),n = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	     add_to_r(arr, n);
	   
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
