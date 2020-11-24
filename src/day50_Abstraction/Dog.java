package day50_Abstraction;

public class Dog  extends Animal{           // Dog compile error Constructor must be called from the Animal class

	public Dog(char Gender,byte Age,String color,String Nickname) {            // so we have to create a constructor with argument as the same one we have in the animal class
		super(Gender, Age,color, Nickname); // functionality of this constructor will assign the gender ,age..to this instance variable 
	
	// Abstract method must be implemented if not we will still have compile error
	
	}

@Override
public void Speak(String Language) {
	
	System.out.println(NickName+"is speaking"+Language);
}

@Override
public void Eat(String food) {
	System.out.println(NickName+"is eating"+food);
	
}

@Override
public void Sleep(int hour) {
	
	System.out.println(NickName+"is sleeeeeeeping"+hour);
}

@Override
public void Drink(String drink) {
	
	System.out.println(NickName+"id drinking"+drink);
}
	
	
	
	
}
