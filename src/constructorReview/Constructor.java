package constructorReview;

import java.util.ArrayList;

public class Constructor {

	//public static void main(String[] args) {
		
		
		
		
		
		
	
	public Constructor(int a) {
		this(10.5);
		System.out.println("constructor with argument: "+a);
		
	}
	
	public Constructor(double a) {
	//	this(10.5);  // constructor cannot call it self 
		
	//	this(10);  // constructor cannot contain itself
	
		System.out.println("constructor with double argument: "+a);
	
		
	}
	
	public Constructor(boolean a) {
		// Constructor(9);   // constructor cannot be called by constructor name
	
	//		System.out.println("constrcutor with argument of: "+a);
							// the constructor call HAS to be the priority in the constructor
			
	//	this(100);
		this(10.5);
		
		System.out.println("constrcutor with boolean argument of: "+a);
	}
	
	
	public static void main(String[] args) {
		
		// Constructor obj = new Constructor("Hello");
										// the constructor is not exist
		
	//	Constructor obj2 = new Constructor();
							// the constructor is not exist
		
		Constructor obj3 = new Constructor(100);
		
		System.out.println("====================================");
		
		method1();
		
	//	Constructor();
		
		Constructor obj4 = new Constructor(true);
		
	
		
		ArrayList<String>list=new ArrayList<>();
		list.add("apple");
		list.add("banana");                       // grape   
		list.add("grape");//removed               
		list.add("melon");
		list.add("peach");
		String str=  list.remove(2);
		System.out.println(str);
		boolean result=list.remove("apple");    
		System.out.println(list);                 // banana melon peach 
		System.out.println(result);                //true
		
		
		
		
	
	
	}
	
	
	public static void method1() {
		
		System.out.println("this is method");
	}
	
	

}