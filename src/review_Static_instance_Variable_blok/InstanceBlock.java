package review_Static_instance_Variable_blok;

import java.util.Arrays;

public class InstanceBlock {
	

	
	String [] names=new String[3];
	
	
	{
		System.out.println("instance block");// will not be executing because the instance block needs an object 
	    names[0]="syfo";
	    names[1]="alla";
	    names[2]="kurshed";
	
	 //   names[3]="sukran"; index 3 out of bounds for length 3
	}
	
	
	public InstanceBlock() {
		System.out.println("this is a constructor");
		
		names[0]="rahwa";
	    names[1]="gulmina";
	    names[2]="esma";
	
	}
	
static {
	
		System.out.println("this is static blokc");
	}
		
	
	public static void main(String[] args) {

		InstanceBlock obj1=new InstanceBlock();
		InstanceBlock obj2=new InstanceBlock();
	System.out.println("main method");	
	System.out.println(Arrays.toString(obj2.names));// error call instance(names) in static method so we call is through the object 
		
		// will print the last assigned value for name which is the constructor 
	// static executed first then instance block then constructor
	
		
		
		
		
		
	}

}
