package day45_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

class credential {

	
	private String userName;
	private String passWord;
	
	
	public String getuserName() {
		return userName;      // private is accessible between the curly brace (within the class)
		
	}
	
	public String getpassWord() {
		return passWord;
		
	}
	
	public void setuserName(String userName) {
		this.userName=userName;
	}
	
	public void setpassWord(String passWord) {
		this.passWord=passWord;
	}
	
	public void setCredential(String username, String passWord) {
		this.userName=userName;
		this.passWord=passWord;
	}

	 public void getInfo() {
			System.out.println( "username: " + getuserName() );
			System.out.println( "password: " + getpassWord() );
	 }	
}

public class EncapsulateReview {

	public static void main(String[] args) {
		credential Zlfy=new credential();
		          
//		obj.userName = "Zlfy";   // private is only visible within the class
			//	obj.passWord = "123456"; // private is only visible within the class
			
			// read:
				Zlfy.setCredential("Zlfy", "111");
			
				System.out.println( "username: "+Zlfy.getuserName() );
				System.out.println( "password: "+Zlfy.getpassWord() );
				
			credential Nurzat = new credential();
						Nurzat.setuserName("9876");
						Nurzat.setpassWord("nuri345");
				
				System.out.println( "username: "+Nurzat.getuserName());
				System.out.println( "password: "+Nurzat.getpassWord() );
				
			
			credential Seyfo = new credential();
				Seyfo.setCredential("Seyfo", "456");
				Seyfo.setpassWord("789");
			
				Seyfo.getInfo();
				
				System.out.println("==============================================");
			
				credential[]  users = { Zlfy, Nurzat, Seyfo };
					users[0].getInfo();
					users[1].getInfo();
					users[2].getInfo();
			
			
			ArrayList<credential>  CredentialsList = new ArrayList<>();
				
	     	CredentialsList.addAll(Arrays.asList(Zlfy,Nurzat,Seyfo));
		  //   CredentialsList.get(0).getInfo();
		 
	     	for(credential each: CredentialsList) {
	     		each.getpassWord();
	     	}
	     	
	}
	
}
