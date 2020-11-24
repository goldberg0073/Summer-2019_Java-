package day49_Recap;

public abstract class Abstraction {    //  abstract class ===> after addind the key word abstract it becomes concrete
	
	public abstract void startTheCar();  // method abstraction must be created inside absrtact class or interface

	
	
}
	class Toyota extends Abstraction{
		
		@Override
		public void startTheCar() {
			System.out.println("break");
			System.out.println("push the start button");
			System.out.println("Release the brake");
			
		}
		public static void main(String[] args) {
		
		//	public abstract void startTheCar();		
		//	Abstraction obj=new Abstraction() 

	}
	
}

class Tesla extends Abstraction{
	// must implement the abstract method 
	
	public void startTheCar() {
		System.out.println("voice control");
		System.out.println("drive");
	}
}