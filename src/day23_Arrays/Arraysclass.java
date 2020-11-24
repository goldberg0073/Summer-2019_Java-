package day23_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraysclass {
public static void main(String[] args) {
	

	int []num=new int [4];
	num[0]=12;
	num[1]=45;
	num[2]=398;
	num[3]=99;
	int []num1= {3,67,555,6};
	
	
	System.out.println(Arrays.toString(num1));
	Arrays.sort(num1);
	
	for(int each:num1) {
		System.out.println(each);
	}

   String str= Arrays.toString(num);
   System.out.println(str);
   
   
   ArrayList<String>list=new ArrayList<>();
   
   list.add("apple");
   list.add("banana");
   
   System.out.println(list);
   
   String str5 ="ALL THE LETTERS";
   String NONDUPL="";//ALTHERS
   for(int i=0;i<str5.length();i++) {
	   if(!NONDUPL.contains(""+str5.charAt(i))) {
		   NONDUPL+=""+str5.charAt(i);
	   }  
   }
   System.out.println(NONDUPL);
   String Unique="";//AHRS
   for(int i=0;i<NONDUPL.length();i++) {
	   int count=0;
	   for(int j=0;j<str5.length();j++) {
		   if(""+NONDUPL.charAt(i)==""+str5.charAt(j)) {
			   count++;
		   }
		   if(count==1) {
			   Unique+=""+str5.charAt(j);
		   }
		   
	   }
	   
   }
   
   System.out.println("The Unique Letters"+Unique);
  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   
}
	
}

