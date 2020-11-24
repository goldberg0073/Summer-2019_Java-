package day45_Inheritance;


class Data{
	public String name;
	private String age;
	String ID;
	
	
	public void Hello() {
		System.out.println("hello A");    //public                          //these are instance methods , call them form the object
	
	}

	private void Hola() {
		System.out.println("hola A");//private
	}
	void Hi() {
		System.out.println("hi A");//default 
	}

	
}


public class MultiClassPractice {

	
	public static void main(String[] args) {
		Data obj=new Data();
		System.out.println(obj.name);// public is visible at everywhere
		//  System.out.println(obj.age);// private is not visible outside the class
		System.out.println(obj.ID); // default access modifier is visible to class same package
	
	// if these two class are located in two different packages ==> default access will not be visible

	    
	obj.Hello();
	obj.Hi();

	
	
	}
}



























