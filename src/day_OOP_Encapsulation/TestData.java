package day_OOP_Encapsulation;

public class TestData {

	/*
	 Name
	 ID 
	 */
	private String Name="hisham";
	private int ID =897;
	
	public int getID(){
		return ID;
	}
	
	

	public String getName() {   // getter method (with a return type) is used to read the value of the instance variable
		return Name;
	}
	
	
	public void setName(String Name ) {     // setter method (with void ) is used to change the value of the instance variable
		this.Name=Name;   // we used this keyword if the instance variable has the same name as the local variable Name and Name.
	}                     // otherwise we just assign the local variable to the instance num assign to ID in the second Example 
	
	
	public void setID(int num) {  // in automation the variable has the same name so calling "this" keyword is a must
		ID=num;
	}
	
	
	
}
