package day39InstanceReview;

public class CellPhoneObjects {

	public static void main(String[] args) {
		
		
		Cellphone phone1 = new Cellphone();     
		// same name of the costum class Cellphone
		System.out.println(phone1.brand);        //null   default constructor
 		System.out.println(phone1.color);        //
 		System.out.println(phone1.model);        //null
 		System.out.println(phone1.price);        //0.0
 		System.out.println(phone1.screen);       //0.0
	
	    // create new default values within the constructor    ..........new Cellphone(????);
	    
 		Cellphone phone2=new Cellphone("Motorola",200,"gray",5.9,"12");
 		phone2.getInfo();   

	
	
	}
	
}
