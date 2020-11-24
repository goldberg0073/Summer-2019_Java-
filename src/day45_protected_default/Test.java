package day45_protected_default;

import day45_Inheritance.ProtectedVsDefault;

public class Test extends ProtectedVsDefault{
        //      sub                super
	/*
	 protected String name;
	 protected void printHello(){            when i create the object down i should be able to access to the invisible features
	 }
	 
	 *****Invisible features******
	 */
	
	
	public static void main(String[] args) {
		
		ProtectedVsDefault obj=new ProtectedVsDefault ();
		//obj.printHello(;) Protected is not visible outside the packege
		
		//obj.prinHola(); default not visible
	
		//obj.name;
		//obj.id;
		
		
		
		
		System.out.println(name);
		
	}
}
