package day14_Scanner;



public class tajriba {

	
	public static void main(String[] args) {
		
		
		
		int num1 =9;

		if(num1++ == 10) {  // line 1

		System.out.println("Hello World "+num1);    // line 2

		}

		else {

		System.out.println("Hello Universe "+num1);  // line 3
		
	int num=1;
	switch (num=8) {
	case 0 :
		System.out.println("zero");
		break;
	case 1 :
		System.out.println("one");
		break;
	case 2 :
		System.out.println(" two");
		break;
	case 3 :
		System.out.println("three");
		break;
	case 4 :
		System.out.println("four");
		break;
	case 5 :
		System.out.println("five");
		break;
	case 6 :
		System.out.println("six");
		break;
	case 7 :
		System.out.println("seven");
		break;
	case 8 :
		System.out.println("eight");
		break;
	case 9 :
		System.out.println("nine");
		break;
	default :
		System.out.println("Invalid number");
		
	}
		
	int n=5;
	String result2=(n==9)? "nine":(n==8)?"eight":(n==7)?"seven"
			        :(n==6)?"six":(n==5)?"five":(n==4)?"four"
			           :(n==3)?"three":(n==2)?"two":(n==1)?"one":(n==0)?"zero": "Invalid " ;
	
	System.out.println(result2);
	
	
	
	
	
	
	
	
	}
}
}