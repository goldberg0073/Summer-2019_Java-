package day14_Scanner;

public class QuizReview {

	public static void main(String[] args) {
		
		int year=2000;
		if (year % 4==0) {
			System.out.println("the year "+year+" is a leap year");
			
		}
		
		else {
			System.out.println("the year "+year+" is not a leap year");
		}
		
		int grade = 120;
		if (grade>=0 && grade <=100) {
			if (grade>=90&& grade<=100) {
				System.out.println("A");	
			     }
			else if (grade>=80 && grade<90) {
				System.out.println("B");
			}
			else if (grade>=70 && grade<80) {
				System.out.println("C");
			}
			else if (grade>=60 && grade <70) {
				System.out.println("D");
			}
			else if (grade>=50 && grade <60) {
				System.out.println("F");
			}
			else {
				System.out.println("you failled");
				
			}
			}
		else {
			System.out.println("Invalid grade");
		
		}
	
	
	
	
		int age =19;
		boolean GoodPerson=true;
		
		if (age>=18) {
			System.out.println("you can buy milk");
		}
		    if (GoodPerson) {
			System.out.println(" drinking is bad");
			
		}
		    else {
			System.out.println("you can buy cigarettes");
		}
		
		       if (age>=21) {
		    	System.out.println("you can smoke hookah");
		    }
		       if (age>=25) {
		    	   System.out.println("you can drink alcohool");
		       }
		
				String Schoolname ="";
				boolean Batch12 = false;	
				if(Batch12) {
					Schoolname ="Cybertek";
					System.out.println(Schoolname);
				} else {
					Schoolname ="Invalid";
					System.out.println(Schoolname);
		}
		   
				
				
		       Schoolname = (Batch12)? "Cybertek" :"Invalid" ;
		
		       System.out.println(Schoolname);
	
	
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
		    		   :(score>=80 && score<=89)?'B'
		    				   :(score>=70 && score<=79)?'C'
		    						   :(score>=60 && score<=69)?'D'
		    								   :(score>=00 && score<=59)?'F'
		    										   :' ';
		       
		    					  
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
	
	}
	
	
}
