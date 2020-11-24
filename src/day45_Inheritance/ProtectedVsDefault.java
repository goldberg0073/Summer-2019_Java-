package day45_Inheritance;

public class ProtectedVsDefault {

	protected static String name;
	          String id;
	protected void printHello() {
		System.out.println("hello");
	}
	
	void printHola (){
		System.out.println("hola");
	}
}


class Cybertek{
	public static void main(String[] args) {
		
		ProtectedVsDefault obj=new ProtectedVsDefault ();
		obj.printHello();
		obj.printHola();
		System.out.println(obj.name);
		System.out.println(obj.id);
		
		
		
		
	}
}


  