package day39InstanceReview;

public class Cellphone {   // no main methos in a costum class

		
		String brand;
		double price;		
		String color;
		double screen;   //  this is a costum class just to create object but we test it in another cloass object
		String model;
		
		 
		public Cellphone() {   //Default constructor      set up default values for attributes of the class
			
			
			brand = "iPhone";        // constructor will be executed when we create object in the main method
			model = "10";
			screen = 5.8;
			color = "white";     //======>        assign values
			price = 700;
			
		}
		
		// create another constructor by overloading 
		public Cellphone(String brand,double price,String color,double screen,String model) {
			this.brand=brand;                           // used to call the instance variable, local and instance variable have the same name 
   //this.brand  assign to instance varaible
			this.color=color;
			this.price=price;
			this.screen=screen;         // advantage to use the same name (instance and local)
			this.model=model;
		}
		
		
		
		
		
		
		
		
		//object
		public void call(long PhoneNumber) {  // create instance variable
			System.out.println(brand+" "+model+"is calling..");
		}
		
		public void Sendmessage(long PhoneNumber) {
			System.out.println("sending message to "+ PhoneNumber); //instance method does not have static specifier
		}
		
		public void getInfo() {       //method aloowed us to print the phone info
			System.out.println(brand+" "+model+" "+color+" "+screen+" "+price);
		    
		}
		
	
		
	}
	
	

