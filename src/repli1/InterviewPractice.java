package repli1;

import java.util.*;

public class InterviewPractice extends A{
	public void methodB(){
		System.out.println("Method-class");
	}
	public static void main(String[] args) {
		 InterviewPractice obg = new InterviewPractice();
//parent A class is a reference 
		obg.methodA(); 
		obg.method1();
		
		
	}
	
}
 class A{ // parent class
	public void methodA(){
		System.out.println("Method-A");
	}
	static void method1() {
		System.out.println("final");
	}
}
