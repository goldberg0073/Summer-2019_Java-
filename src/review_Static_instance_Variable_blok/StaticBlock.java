package review_Static_instance_Variable_blok;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {

	int salary;
	static String[]arr = new String[3];     //static variable call it everywhere
	static ArrayList<String>list=new ArrayList<>();
	
	static {         // static block used for initializing static variable
	System.out.println("raja club athletic");	
	arr[2]="kamal";
	arr[1]="karim";
	arr[0]="casablanca";  
	
	list.addAll(Arrays.asList(arr));
//	salary =5000;   static only accepts static
	
	StaticBlock obj1=new StaticBlock();// is local variable that we can not call outside the curly brace
	obj1.salary=4000;    
	
 	//      static block used for initializing static variable 
    //      instead of assigning value directly after declaring static variable
	//      static ChromeDriver driver=new ChromeDriver();
	//      precondition !!!!!!!!!!!!!!!
	
	/*      example of precondition
	
	        static { 
	           driver.manage().window().maximize();
		
	}   
	
	*/
	
	
	
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("hisham");
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		StaticBlock obj1=new StaticBlock();
		System.out.println(obj1.salary);// gives 0 
		
		
		
	}
	
}
