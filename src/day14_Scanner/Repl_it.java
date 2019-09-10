package day14_Scanner;



       import java.util.Scanner;

public class Repl_it {
	public static void main(String[] args) {

		

/*
In this assignment you will create a Scanner object and ask user to enter 3 number inputs.

-Declare integer variables num1, num2, num3, sum.

-Create a Scanner object named scan.

-Display prompt "Enter 3 numbers:"

-Using scanner object let user input 3 numbers

-Add 3 numbers and assign to sum variable

-Print "Sum of numbers: ValueOfSum"
 */
		
		 
	/*	Scanner scan = new Scanner(System.in);		
		
		
		System.out.println("Enter 3 numbers:");
		int num1 = scan.nextInt();	
		
		int num2 = scan.nextInt();
		
		
		int num3 = scan.nextInt();
		
		System.out.println("Sum of numbers:" +(num1+num2+num3));*/
		
		
/*
if grade is bigger then 90 output "excellent" 

if the grade is bigger then 70 and smaller then 90 output "good"

if grade is bigger then 60 and smaller then 70 output "pass"

if grade is smaller then 60 output "fail"

hint: && is the operator for and in java.
 */
	/*	int grade =90;
		if (grade >90) {
			System.out.println("excellent");
		}
		if (grade>70 && grade<90) {
			System.out.println("good");
		}
		if (grade>60 && grade<70) {
			System.out.println("pass");
		}
		if (grade<60) {
			System.out.println("fail");
		}
		
		
		int n1=1,n2=2,n3=5;
		
		
		
		if (n1>n2&&n1>n3) {
			System.out.println("n1 is bigger");
		}
		if (n2>n1&&n2>n3) {
			System.out.println("n2 is bigger");
		}
		if (n3>n1&&n3>n2) {
			System.out.println("n3 is bigger");
		}
		
	*/	
		
		
		int inputSeconds=3695 , hours=(inputSeconds/3600)%0 , minutes=(inputSeconds/60)%0 , seconds=inputSeconds ;
		
		
		
	
		
		System.out.println(hours);
			
		
		System.out.println("inputSeconds:\n"+ hours+","+minutes+",and"+ seconds );
	}




    
   











































































































}
