package repli1;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise188 {

	
	public static ArrayList<String> removeAll(ArrayList<String>wordList,String targetWord){
		 
/*		 
		String d ="";
		   for ( int i = 0;  i < wordList.size(); i++){
	             // name=wordList                          list1.get(0)="hi"
	            if(wordList.get(i).equals(targetWord)){ //true   ========> remove(0)
	            	
	           
	            	// System.out.println(wordList.remove(i));
	                    wordList.remove(i);
	            	
	}
		   }
	
		*/
		
		//   System.out.println(d);
       	for (String each:wordList) {
			if(each.equals(targetWord)) 
				wordList.remove(each);	
			
			
			
		}
		
		
		
		System.out.println(wordList);
		
		
		
		ArrayList<String>removeAll=wordList;
		  
		  
	return removeAll;	  
		}
	    public static void main (String[]args){
	                                                           //  0   1    2      3    4    5     6   7
	  ArrayList<String>list1=new ArrayList<String>(Arrays.asList("hi","hi","gad","kad","hi","hi","wac","hi","hi"));
	   /*     list1.add("hi");
	        list1.add("hi");
	        list1.add("hi");
	        list1.add("hey");
			list1.add("hi");
			list1.add("yo");
			list1.add("hi");
			list1.add("hi");
		*/	
			
	  String what ="hi";
	  
	  
	 removeAll(list1,"hi");
	  System.out.println(list1);
	
	
}
}