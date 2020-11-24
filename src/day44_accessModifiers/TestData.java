package day44_accessModifiers;

public class TestData {

	public static String Name="julia";
	public static int ID=2007;
	public static String school="cybertek";
	
	 private static String  Password = "Cybertek";
	 static int age=20;   //access modifier is default.
	// we can use it within the classes in the same package however we can not use it outside the package 
	
	
	
	public static void printHello() {
		System.out.println("hello world");
	}
	
	
}
