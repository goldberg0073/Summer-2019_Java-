package review_Static_instance_Variable_blok;

public class Practice {

	
	public static void main(String[] args) {
		
		

	
		staticKeyword.printName();   // hisham
		// static methods can be called through the class name 
		
		
		
    	//	staticKeyword.printName2();  instance method can not be called through the class name 
		
		
		Practice.printName(); // raja
		
		printName();// raja
		
		
		System.out.println(staticKeyword.StaName);
		// static features can be called through class name
		
         //	System.out.println( staticKeyword.InsName );
		// instance vairables belong to the object, cannot be called through class name
		
		
		// to call  public void printName2() "instance method" must be through the object
		// create object first(obj) 
		staticKeyword obj=new staticKeyword();
		obj.printName2();
		// here we did so because we're calling this instance method inside a static method which is the main static method
		
	}
	
	public static void printName() {
		System.out.println("raja");
	}
	
	
	
}
