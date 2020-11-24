package day46_SuperKeyword;

class A {
	public String name1="ayaz";
}
class B extends A{
	public String name2="Sukran";
	public String name3="erhan";
}





public class Inheritance extends B {
	
//	public String name1="ayaz";

//	public String name2="Sukran";
//	public String name3="erhan";
			
	public String name4="Mehmet";
	public String name5="Mahribana";
	
	
	public static void main(String[] args) {
		
		
		Inheritance obj=new Inheritance();
		
		System.out.println(obj.name1);
		System.out.println(obj.name2);
		System.out.println(obj.name3);
		System.out.println(obj.name4);
		System.out.println(obj.name5);
		
		B obj2=new B();
		
		System.out.println(obj2.name1);
		System.out.println(obj2.name2);
		System.out.println(obj2.name3);
//		System.out.println(obj2.name4);
//		System.out.println(obj2.name5); 
		
		
		A obj3=new A();
		System.out.println(obj3.name1);
		
	}
}
