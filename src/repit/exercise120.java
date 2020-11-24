package repit;

import java.util.Scanner;

public class exercise120 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
    String[] str = {scan.next(), scan.next(), scan.next(),    // 0 1 2 3 4 5 
                    scan.next(), scan.next(), scan.next()};  //  gray purple red  blue orange green
 String shortest="";                               
 
 for(int j=0;j<str.length;j++) {
 for(int i=0;i<str.length;i++){    // 5
   if(str[i].length()>str[j].length()){  //      i   0 1 2 3 4 5    str[5]  str[6]
                                           // i=0  j= 1 2 3 4 5 6   i=1  j= 2 3 4 5 6 
	   
	   shortest+=str[j];
	    
   }
  // System.out.println(str[i].length()); 
 }  
 
 }
 
             
 System.out.println(shortest);
	
	
}
}
