package day10_IfStatement;

public class Multi_branch {

public static void main(String[] args) {
	
	
	int Grade =20;
    boolean A=Grade>=90&&Grade<=100;
    boolean B=Grade>=80 && Grade <90;
    boolean C=Grade>=70 && Grade<80;
    boolean D=Grade>=60 && Grade<70;
    boolean ValidGrade=Grade>=0&& Grade <=100;
    
if (ValidGrade)	{
	 if (A) {
			System.out.println("passed with a grade of A");}
	
	 else if (B) {
			System.out.println("passed with a grade of B");}
	 
	 else if (C) {
			System.out.println("passed with a grade of C");}
	 
	 else if (D) {
			System.out.println("passed with a grade of D");}
	 
	 else {
		 System.out.println("you failed");
	 }
			
}		
else { System.out.println("really !!!!!");}			
				
				
				
	
}

}








