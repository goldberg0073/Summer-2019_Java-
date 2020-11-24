package day39InstanceReview;

import java.text.DecimalFormat;

public class DecimalFormatter {

	public static void main(String[] args) {
		
		// import the class Decima control command
		
		DecimalFormat format = new DecimalFormat("0.00");
		double d=23.25986562;
		// format(double): formats the decimals and returns string value
		
		      String num1=format.format(d);
		      System.out.println(num1);
		 double c=45.56789;     
		      
        System.out.println(format.format(c));    // third decimal is greater than 5 so it adds 2 to the second decimal 45.57
	      c=Double.parseDouble(format.format(c));    // parse convert string to the double 

	      System.out.println(c+1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
