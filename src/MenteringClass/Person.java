package MenteringClass;

public class Person {
	
	String Name;
	byte Age;
	private String Address;
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address=Address;
	}

	
	public void getInfo() {
		System.out.println("The emplyee name is "+Name+" The adress is "+Address+" The age is "+Age);
		
	}
	
	
}
