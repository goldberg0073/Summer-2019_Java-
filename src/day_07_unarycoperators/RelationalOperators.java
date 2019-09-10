package day_07_unarycoperators;

public class RelationalOperators {
	
	/*
	 Relational Operators :return boolean expression
	 >  :greater than
	 >= :greater than or equal
	 <  :less than
	 <= :less than or equal
	 == :equal
	 != :not equal
	 =  :assign:
	 !  :Exclamation mark in java means the logical opposite. 
	     not
	 */
	
public static void main(String[] args) {
   
	System.out.println(10>9);
	boolean resultA=10>9;
	System.out.println(resultA);   
    
	boolean resultB=10>=9;
	System.out.println(10>=9);// greater pt equal
	
	boolean resultD=1100>1200;
	System.out.println(resultD);
	
	
	boolean resultH=20!=20;
	System.out.println(resultH);
	
	boolean A=true==!false;
	System.out.println(A);
	
	boolean result12 = !false ||!true || !true && !true;
	
	
	
	
	boolean T =!(8>5)||!("today" !="friday");
	System.out.println(T);
	
	
	
	
	
	
	
	
}
	
	
	
	
	
}
