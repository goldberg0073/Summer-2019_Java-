package day_OOP_Encapsulation;

public class EmployeeInfo {

	/*
	 Name
	 SSN
	 Age
	 Salary
	 */
			
	
/*	String Name;
	long SSN;
	byte Age;
	double Salary;
	
*/	
	
	private String Name;
	private long SSN;
	private byte Age;
	private double Salary; 
	// getter and setter for Name	
public void setName(String Name) {
	this.Name=Name;
}
	
public String getName() {  // I didn't pass any data in between the parentheses because 
	return Name;           // I don't want change any value just to read the variable
}
	//getter and setter for SSN


   public void SetSSN(long SSN) {   //setter method
	   this.SSN=SSN;
   }
    
   public long getSSN() {
	  return SSN; 
   }















}
