package OCA_Exam;

class A extends Greeting{
	public A(String name) {
		super(name);	
	}
	String str="String";
	public int TheSum(int num1,int num2) {
		
		int sum=num1+num2;
		return sum;
		
	}
}
class B extends Greeting {

	 public B(String Smt, int number) {
		super(Smt, number);
		
	}
	
}
interface Z{
	
}
interface X extends Z{
	
}

public class Greeting implements Z {

	private static String name;

	public Greeting(String name) {
		this.name=name;
	}
	public Greeting(int num) {
		this(name);
	}
	public Greeting(String Smt,int number) {
		
	}
	
	public static void main (String []args) {
		

		
	 Greeting obj=new Greeting(0);
	String name= obj.name="hisham";
	
	 System.out.println(name);
		
		
	}
	
}
