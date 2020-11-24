package day45_Inheritance;

public class MultiClass {

	public static void main(String[] args) {    // only one public class 
		
		System.out.println("main public class");
		
		
	}
	

	
}

class A {  // cant give public here because there is only one file public has the name of the class(Inheritance) ==>MultiClass.java
	
	public static void main(String[] args) {
		
		System.out.println("default class B");
		
		
	}
}

class B {       // cant give public here because there is only one file public has the name of the class(Inheritance) 
	
	public static void main(String[] args) {
		
		System.out.println("default class B");
		
		
	}
}


