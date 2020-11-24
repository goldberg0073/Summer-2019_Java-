package day_OOP_Encapsulation;

public class Test {

	public static void main(String[] args) {
		
		
		TestData obj=new TestData();
		
		
	//	System.out.println(obj.name);// encapsulation used to hide this (instance variable)data from the other classes 
		                             // Access private modifier "private" ==> the data is not accessible to any other classes
		                             // the question is how i can access to this data without changing anything in the class
	                                 // using public getter and setter method
	
		// getter is a public method that will return the value of the object===> read the value of the data.
		//setter ==> void method to change the value however getter with return type is for read the value 
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getID());
		
		
	//	obj.Name()="raja";
	
		
		obj.setName("raja");
		System.out.println(obj.getName());
	
	    obj.setID(2019);
	System.out.println(obj.getID());
	
	
	}
	
}
