package EarlyBirdPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome_reverse {
	
	public static void main (String[] args) {
		
		
		
		int []arr= {12,13,14,15,16,17,19,10,20};
		
		List<Integer>list= new ArrayList();
	
		for (int i=arr.length;i<=0;i--) {
		      
		}
		System.out.println(list);
		
		
		
		
		
		
		
		String palindrome="Do geese see God";
		String ToReverse=palindrome.replace(" ","").toLowerCase();
		String Reverse="";
		for (int i=ToReverse.length()-1;i>=0;i--) {
			Reverse+=""+ToReverse.charAt(i);
		}
		
   System.out.println(Reverse);
	
	
    System.out.println(Reverse.equals(ToReverse));
	
	System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
	
	
	String str="AAAQQQXXXZZZAASRRTNNNA";
	String NonDuplicate="";
	for (int i=0;i<str.length();i++) {
//		if(NonDuplicate.contains(""+str.charAt(i))) {
//			
//		}
		if (!NonDuplicate.contains(str.substring(i, i+1))) {
			NonDuplicate+=str.subSequence(i, i+1);
		}
	}
	System.out.println(NonDuplicate);
	//AQXZSRTN
	//AAAQQQXXXZZZAASRRTNNNA
	String ExpectedResult="";
	for (int i=0;i<NonDuplicate.length();i++) {
		int count=0;
		for (int j=0;j<str.length();j++) {
			if(str.charAt(j)== NonDuplicate.charAt(i)) {
			count++;	
			}		
		}
		ExpectedResult+=NonDuplicate.charAt(i)+""+count;
	}
	System.out.println(ExpectedResult);
	}
	
	
	
	
	

}
