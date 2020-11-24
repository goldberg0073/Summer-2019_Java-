package review_Static_instance_Variable_blok;

public class Login {
	
	public static void main(String[] args) {
		
		
		Credentials obj =new Credentials();
	//	obj.password="fatih";// instance variable password is private
	//	obj.username="hicham";//instance variable username is private 
		
	//	System.out.println(obj.username);
	//	System.out.println(obj.password);
		
		
		
		
		
		// read
		System.out.println(obj.getPassword());
		System.out.println(obj.getUserName());
	
	   // change or modify:
		obj.setPassword("changed password");  // this value will be assign to (String username)  ===> this.username = username;
	    obj.setUserName("changed username");
	
	    
	   // System.out.println(obj.setPassword("changed password"));
	    
	    
	}

}
