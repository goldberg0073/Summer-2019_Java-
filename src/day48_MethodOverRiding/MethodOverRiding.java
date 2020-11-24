package day48_MethodOverRiding;


class student{
	public void printName(){
		System.out.println("Hakan");
	}
}




public class MethodOverRiding extends student {
	
//	
//	public void printName(){
//		System.out.println("Hakan");
//	}
//}
	
	
	
	public void print(String str) {
		
	}
    public void print (double a) {
    	
    }
    
    
    public void printName(){
		System.out.println("hisham");  // this method has the same name with the method on the super 
	}
    
    
//	public void print(String str)  //(overriding) can not have 2 method with the same parameter in the same class
// overloading can happend in the same class because # parameters	

    
    
    
    
    public static void main(String[] args) {
		
    	MethodOverRiding obj =new MethodOverRiding();
    	obj.printName();   // its calling from the sub class
    	student obj2=new student();
    	obj2.printName();// its calling from the method prinName
    	
    	
    	
	}
}
