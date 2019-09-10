package day7_unary;

public class Hicham_raja {

public static void main(String[] args) {
	    
	
	
	String US ="USA";
	
	if( US == "USA" || US =="America" || US =="US") {
		System.out.println("American");
	} else {
		System.out.println("Not American");
	}
	
	switch ( US ) {
		case "US":
		case "USA":
			System.out.println("great");
		     
		case "America":
			System.out.println("American");
			break;
			
		default:
			System.out.println("Not Amrican");

	}
	 char charValue='B'; 
    String str ="hi";
    int N5=2;
	long N1 = 10; // 10L
//	switch (N1) { }
	
	float N2 =100f; //100.0f
//	switch(N2) { }
	
	double N3 = 10;
//	switch (N3) {   }
	
	boolean N4 = true; //  9 < 8
//	switch (N4) { }
	
	switch (charValue) {
	
	}

	
	char grade1 = 0;
	
	if( grade1 >= 60 && grade1 <= 100) {
		System.out.println("you passed");
		
		if( grade1 >=90 && grade1 <= 100) {
			System.out.println("\twith a grade of A");
			
		} 
		else if(grade1 >=80 && grade1 < 90) {
			System.out.println("\twith a grade of B");
		}
		else if(grade1 >= 70 && grade1 < 80) {
			System.out.println("\twith a grade of C");
		}
		else {  // 60 <= grade < 70
			System.out.println("\t with a grade of D");
		}
		
	}
	else {  // either less than 60 or greater than 100
		
		if(grade1 < 60) {
			System.out.println("You failed with a grade of F");
		}
		else { // greater than 100
			System.out.println("Invalid score, error 404");
		}
		
		
		char grad1e='A';	
	if(grade1 == 'A' && grade1 =='B') {				
		System.out.println("Passed the exam");
		System.out.println("withA");
	} else {
		System.out.println("Failed");
		System.out.println("next time");
	}

	switch (grade1) {
		
	
	
		
	    case 'A':
			System.out.println("you passed the exam with A");
		    
		case 'B': 
			System.out.println("passed the exam with B");
			System.out.println("failed the exam");
			System.out.println("go home");
	        
		default :
			System.out.println("nice");
			
			
		case 'F':
			System.out.println("well done");
			
			
		
	}




	if(true) {
		System.out.println("Hello batch 12"); // printed
		
		if(false) {
			System.out.println("Hello programmers");
		} 
		else {
			System.out.println("Hello Team SDET"); // printed

		}

	    }


	int grade = 40;
	
	if( grade >= 60 && grade <= 100) {
		System.out.println("you passed");
		
		if( grade >=90 && grade <= 100) {
			System.out.println("\twith a grade of A");
			
		} 
		else if(grade >=80 && grade < 90) {
			System.out.println("\twith a grade of B");
		}
		else if(grade >= 70 && grade < 80) {
			System.out.println("\twith a grade of C");
		}
		else {  // 60 <= grade < 70
			System.out.println("\t with a grade of D");
		}
		
	}
	else {  // either less than 60 or greater than 100
		
		if(grade >=0 &&grade < 60) {
			System.out.println("You failed with a grade of F");
		}
		else { // greater than 100
			System.out.println("Invalid score, error 404");
		}

	}

}
      
}		
}

