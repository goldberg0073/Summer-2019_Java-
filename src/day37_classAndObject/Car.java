package day37_classAndObject;

public class Car {

	/*
	car
	data/attribute
		model, Year, brand, color, price, milage,VIN....

	actions:
		start, driver, accelerate, stop, drift, brake, get ticket..

	

	 */
	
	String model; // variable name for the class model      instance variable   
	int years;     // this is a class for the year
	String color;
	double price;
	long milage ;
	String brand;
	
	// create instance method 
	
//	access-modifier        return type          method name
	public                void                   drive() {   //  drive method      actions of the class
		System.out.println("Driving"+brand);
	}
	
	public                void                   start() {   //  drive method
		System.out.println("starting"+brand);
	}
	
	public void getinfo() {
		System.out.println(years+" "+brand+" "+model+", "+color+", "+price+"$");
	}
	
	
	
	
}
