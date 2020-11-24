package day45_Inheritance;



class TestBase{        // this is a Super class
	
	static String chromeDriver;// default 
	
	
	public static void TakeScreenShot() {
		System.out.println("took screen shot");
	}
	
	private static void closeBrowser() {
		System.out.println("close the browser");
	}
	
	
}

class D extends TestBase{       // a class can only extend one class but a class can not be extended by more than 1  
	                           // ====> we can have to many sub classes for one super class
}


           // sub class       super class
public class Inheritance extends TestBase{
   // sub class will  inherit all the visible or protected features from the super class
	                              //"  one of the two for ex private can not be inherit into the class   "
	                             //  first not visible to the class second not protected
	// static String chromeDriver;
	
	/*
	public static void TakeScreenShot() {
		System.out.println("took screen shot");          // this class is not empty 1 of all there is a constructor
	}                                               // in this class there is also the two features of the Testbase class 
                                                   // 
	 */
	
	
	public static void main(String[] args) {
		
		
		System.out.println(chromeDriver);
		
		
		
	}
	
}











