package day_07_unarycoperators;

import java.util.Arrays;

public class SolutionN {
	
	public static int[] Solution(int N){

		int[]result=new int[N]; // 4
	   int sum=0;
	   for(int i=0;i<N-1;i++) {
		   result[i]=i;
		   sum+=i; // 0+1+2=3
	   }
	result[N-1]=-sum;
	return result;
	   
	}   
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Solution(15)));
		System.out.println(same("ABFCD", "DFCBA"));
		
	
		String str="AAABBBCCCFGDR";  // abcfgdr
		String [] str1=str.split("");
		String unique="";
		for(int j=0;j<str1.length;j++) {
		int count=0;
		for(int i=0;i<str.length();i++) {
		
			if(str1[i].equals(str1[j])) {
				count++;
		
	        }
			
			}
	      if(count==1) {
	    	  unique+=str1[j];
	      }
		
	    
		
		}
		  System.out.println(unique);
			  
		}	
		
	
	
	public static boolean same(String a, String b) {

		char[] ch1 = a.toCharArray();

		char[]  ch2 = b.toCharArray();

		Arrays.sort(ch1);

		Arrays.sort(ch2);

		String a1="", a2="";

		for(char each: ch1)

		a1 +=each;

		 

		for(char each: ch2)

		a2 +=each;

		 

		return  a1.equals(a2) ;

		}

}
