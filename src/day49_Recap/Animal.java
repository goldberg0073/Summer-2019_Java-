package day49_Recap;

public abstract class Animal {    // animal is generic can be any animal
	
	
	public abstract void eat () ;          // eat also generic can be any thing     this method meant to be override

	public abstract void sleep();         // its abstract                           this method meant to be override
}
// concrete 
class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eats fish");
		
	}
	public void sleep() {   // we have to concrete all the abstract method first if not it will give a compile 
		System.out.println("Cat sleeps 14 hours");
	}
}

class Tiger extends Animal{
	
	public void eat() {
		System.out.println("Tiger eats meat");
		
	}
	public void sleep() {   
		System.out.println("Tiger sleeps 19 hours");
	}
	
	
}

class Test {
	
	
public static void main(String[] args) {
		
	 Cat obj1=new Cat();
	 obj1.eat();
	 
	 Tiger obj2=new Tiger();
	 obj2.sleep();
		
		
	}
}
