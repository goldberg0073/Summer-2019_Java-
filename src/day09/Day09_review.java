package day09;

public class Day09_review {

	public static void main(String[] args) {
		
		/*
		 Relational Operators:
		
		 
		 >  : greater than          x=10   y =9       only returns true when x > y ;
		 >= : greater than or equal                   returns true : either greater or equal;==> 2 possibilities;                   
		 <  : less than                               only returns true when x<y ;
		 <= : less than or equal                      returns true : either less or equal; ==> 2 possibilities;
		 == : equal               X=10, Y =10         true if equal only ==> 1 possibility;
		 != : not equal 
		 
		 Logical Operators 
		 
		 && :  true    true     =====> true  only 
		       true    false    =====> false
		       false   true     =====> false 
		       false   false    =====> false 
		  
		 || :  true    true     =====> true
		       true    false    =====> true
		       false   true     =====> true
		       false   false    =====> false  only 
		 
		 
		 */
		  
		
		System.out.println('a'>'A');   // true      A is smaller than a   ASCII table 
		System.out.println('a'<'A');  // false 
		System.out.println('A'<='a'); // true 
		System.out.println('A'!='a');  // true
		
		byte X=10; int Y=10;
		System.out.println(X==Y);  // for primitives, yes.==>true
		
		byte b1=(byte)(127+21);
		System.out.println(b1);
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
