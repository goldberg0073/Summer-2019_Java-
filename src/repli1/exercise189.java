package repli1;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise189 {
	
	public static boolean isError(String line) {
	    
	    if(line.substring(0,5).equals("error"))
	    return true;
	    else 
	    return false;
	    
	  
	  }
	
	public static void main(String[] args) {
		String str ="hisham error boo far";
		Boolean result= isError(str);
		
		
		
		
		System.out.println(result);
		
		
		
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(56,43,32,55,77,8,867,100));
		//list.add(59);
		System.out.println(list);
		System.out.println(list.get(0)*2);
		
		
		
		
	}
	

}
