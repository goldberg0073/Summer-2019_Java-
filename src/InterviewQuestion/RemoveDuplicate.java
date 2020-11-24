package InterviewQuestion;

import java.util.Arrays;

public class RemoveDuplicate {
	
	public static void devides(int num1, int num2) {

		if(num2==0) {

		System.out.println("Invalid Number");

		return;

		}

		System.out.print(num1 +" devid by "+num2 +" is: ");

		int count =0;

		while(num1 >= num2) {

		num1 -= num2;

		count++;

		}

		System.out.println(count+" and remainder is "+num1);

		}

	public static void main (String[]args) {
		
		String str="AAAAABBBBBCCCCZZZKL";
		String RemDup="";
		for(int i=0;i<str.length();i++) {
			if(!RemDup.contains(""+str.charAt(i))) {
				RemDup+=""+str.charAt(i);
			}
		}
		
	    System.out.println(RemDup);//ABCZKL
		String Result="";
		for(int j=0;j<RemDup.length();j++) {
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(RemDup.charAt(j)==str.charAt(i))
					count++;
			}
			Result+=RemDup.charAt(j)+""+count;
		}
	   
	    
	    System.out.println(Result);
	    
	    
	    String A="abcmz",B="mzcba";
	    char[]char1=A.toCharArray();
	    char[]char2=B.toCharArray();
	    
	    Arrays.sort(char1);
	    Arrays.sort(char2);
	    
	    String  A1="",B2="";
	    for(char each:char1) {
	    	A1+=each;
	    }
	    for(char each:char2) {
	    	B2+=each;
	    } 
	    
	    
	    if(A1.equals(B2)) {
	    	System.out.println(true);
	    	
	    }
	    else {
	    	System.out.println(false);
	    }
	
	    devides(50,12);
	  
	
	
	}
	
	
	
	
	
}
