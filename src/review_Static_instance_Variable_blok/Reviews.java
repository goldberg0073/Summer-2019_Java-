package review_Static_instance_Variable_blok;

public class Reviews {
	
	
	static int a;  // variable that shared by class and objects there is only one copy 
	int b;      //instance variable : belong to the object,each object has it own copy of instance variable

	
	
	
	long total=100;
	
	public Reviews() {
		total-=50;
	}
	
	public Reviews(int total) {
	
	this();  //  this()used for calling the constructor(existing one here the default one)....we can only used in the constructor
	this.total+=total; // this. : used for calling the instance variable
	}
	
	{
		total*=2;  // call the instamce variable
	}
	
	static {
		int total=20;
		total/=2;      // this static bloc that's not have any effect one the instance variable total=100;
	}
	
	public static void main(String[] args) {
		
	Reviews obj=new Reviews(25);
	System.out.println(obj.total);     // run first =====> static instance then constructor
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Reviews obj1=new Reviews();
		obj1.b=10;
		obj1.a=20;
		
		Reviews obj2=new Reviews();
		
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		System.out.println(obj1.a);
		System.out.println(a);
		System.out.println(obj2.a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
