package repli1;

public class staticInitializerMethod {

	static String name;
	int Num;
	
	static void printHello() {
		System.out.println("static method");
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		staticInitializerMethod object=new staticInitializerMethod();
		object.name="hisham";
		printHello();
		System.out.println(object.name);
		
	}
	
	
}
