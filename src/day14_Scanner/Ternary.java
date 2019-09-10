package day14_Scanner;

public class Ternary {

 public static void main(String[] args) {
	
	 
	 int num=0;
	 
	 if (true) {
		 num=100;
	 }
	 else {
		 num=50;
	 }
	
	 int n =(false)? 100 :50 ;
	 int y = false ?100:50;    // no parentheses mandatory 
	 System.out.println(num); 		
	 System.out.println(n);
	 System.out.println(y);		  
	 /*
	  if (condition)            ==>(condition) ?
	  else                      ==>  :
	  else if (condition)       ==> :(condition)?
	  */
	String Scoolname="cybertek" , scoolname="google";
	boolean batch12=true;
	
	scoolname=batch12 ? "cybertek":"google";
	 
	 System.out.println(scoolname);     // variable x = (expression) ? value if true : value if false
	 
	 
	byte grade=60;
	boolean Passed = grade>=60 ? true : false;
	System.out.println(Passed);
	
	
	int score=90;
	char finals=' ';
	if (score >=90 && score<=100)
	finals ='A';
	else if (score>=80 && score<=89)
		finals='B';
	else if (score>=70 && score<=79)
		finals='C';
	else if (score>=60 && score<=69)
		finals='D';
	else if (score>=00 && score<=59)
		finals='F';
	else finals =' ';
	
	
	finals = (score >=90 && score<=100)?'A'
			 : (score>=80 && score<=89)?'B'
			  :(score>=70 && score<=79)?'C'
			   :(score>=60 && score<=69)?'D'
			    :(score>=00 && score<=59)?'F'
			     :' ';
	
	System.out.println(finals);
	
	int n1=100,n2=300,n3=400;
	int max = (n1>n2 && n1>n3)? n1
			     : (n2>n1 && n2>n3)? n2
		             : n3 ;
	System.out.println(max);
	
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}



}
