package day48_MethodOverRiding;



class Credentials{
	private final String UserName="Cybertek";
	private final String PassWord="2019";
	
	
////	 public void setUserName(UserName) {
//		 this.UserName=UserName;
//	 }   // final variable cannot be re-assigned     we CAN NOT generate it for final variable
	
	public String getUserName() {
		return UserName;     // we CAN generate it for final variable
	}
	
	
	
}



class Holly{
	
	public void printName() {
		System.out.println("RajaDeCasa");
	}

//	final public void printName() {
//		System.out.println("RajaDeCasa");   final method can never be override
//	}
// because the overriding means changing  the functionality of the method and final keyword make the method constant


}



public class FinalKeyWord extends Holly{
	
	@Override
	public void printName() {
		System.out.println("Morocco");
	}
	
	
	
	
	final int Age=30; // instance variable
	final static int salary=80000;// static variable ================> both of them must be assigned values immediately 
	
	public static void main(String[] args) {
			
	final String SSN="12344567";
	    //  SSN="63563773";    final variables are constant and cannot be reassigned
		
	final String DateOfBirth; // it will be assigned only once 	
		
		System.out.println(SSN);
	//	System.out.println(DateOfBirth); like the local variable it must be given value before printing it out 
		
		
		FinalKeyWord obj=new FinalKeyWord();
		System.out.println(obj.Age);
		System.out.println(obj.salary);
	
		
		
		
		
		
		
	}

}
