package repit;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise169 {

	    public static void main(String[] args) {
		
		
		ArrayList<String>finallist=new ArrayList<String>(Arrays.asList("dima","forever","the best"));
		String []list1= {"raja","club"};
		ArrayList<String>listadd=new ArrayList<String>(Arrays.asList(list1)); 
		finallist.addAll(listadd);
		System.out.println(finallist);
		
		
		
		int  num= wordCount("one two three four five six");
				
		System.out.println(num);
	    System.out.println("**************************************************************************************");
	
		int[]number= {763,45,65,445,223};
		for(int each:number) {
			if (number.equals(45)) {
				System.out.println("true");
			}
		
		}	
	}
	

	 public static int wordCount(String words) {
		   
		   String []word= words.split(" ");
		   int wordCount= word.length;
		    return wordCount;
	
		    
		    
	
		    
	 }
	 	 
}
