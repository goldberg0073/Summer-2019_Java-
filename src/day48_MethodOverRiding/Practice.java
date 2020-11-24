package day48_MethodOverRiding;

import review_Static_instance_Variable_blok.FirefoxDriver;

class WebDriver{
	public void get() {
		System.out.println("Opens browser");
		
	}
}


class ChromeDriver extends WebDriver {
	public void get() {
		System.out.println("Opens Chrome BRowser");  // everything must be the same (public ,return type and parameters
		                                            //in the override just the functionality
		
	}
	
}

class FireFoxDriver extends WebDriver{
	
	
}



public class Practice {
	public static void main(String[] args) {
		
		ChromeDriver Driver1=new ChromeDriver(); 
     	Driver1.get();
	 
     	FireFoxDriver Driver2=new FireFoxDriver();
     	Driver2.get();
     	
     	
     	
     	
     	
	}

}
