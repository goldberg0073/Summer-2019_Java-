package day37_classAndObject;

public class carObjects {

	
	public static void main(String[] args) {
		
		
		Car     car1    =      new      Car();               //Constructor is used to create object  ; default constructor no data type
		
// classname    objectname     keyword    constructor                                             //if we don't create constructor java compiler gives you by default constructor.
		
		car1.brand="BMW";               
		car1.color="White";
		car1.milage=15000;
		car1.model="X6";
		car1.price=45000;
		car1.years=2019;
		
		// we create a class given Car as classname then we call it here........we get all classes to here
		
System.out.println(car1.brand);
System.out.println(car1.color);	
System.out.println(car1.milage);
System.out.println(car1.model);
System.out.println(car1.price);
System.out.println(car1.years);
	
	
        Car car2 = new Car();
        
 System.out.println(car2.brand);  // null we didn't assign any value to the car2 ...we need to store some data into car2
        
    car2.brand="Toyota";               
	car2.color="Green";
	car2.milage=1000;
	car2.model="Corolla";
	car2.price=52000;
	car2.years=2020;
	
	
	car1.drive();// Driving BMW
	car2.drive();// Driving Toyota         
     

	car1.start();
	car2.start();
	
	car1.getinfo();
	
	
	    Car car3 =new Car();
	    
	 car3.getinfo(); // 0 null null o null   default values
	
	    car3.brand="lexus";               
		car3.color="blue";
		car3.milage=1000;
		car3.model="RX350";
		car3.price=40000;
		car3.years=2018;
	 
	 car3.getinfo();
	 
	 System.out.println(car3.brand);
	 
	 
	
	}
	
	
	
	
}
