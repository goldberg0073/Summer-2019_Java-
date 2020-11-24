package day48_MethodOverRiding;

public class Bank {
	
	public void InterestRate(){
		System.out.println("9 percent");
	}

	
	
	
	
	
public static void main(String[] args) {
	BankOfAmerica BOA = new BankOfAmerica();
	BOA.InterestRate();
	
	PNC PNC= new PNC();
	PNC.InterestRate();
	
	CapitaleOne CO= new CapitaleOne();
	CO.InterestRate();
	
	
}
	
}

class BankOfAmerica extends Bank{
//	public void InterestRate(){
//		System.out.println("9 percent");
//	}
	
	@Override
	public void InterestRate(){            // override the methods that are instance method in other word 
		System.out.println("5 percent");   //only instance methods can be override then must be visible to the sub class
	}	                                   // private method and static can not be override
	                                       // the others can be "default protected and public" but there are some requirements
	
	
}

class PNC extends Bank{

	
//	public void InterestRate(){
//	System.out.println("9 percent");
//}
    @Override
	public void InterestRate(){            // overriding method must happened in the SUB class 
		System.out.println("10 percent");  // no inheritance no overriding
	}	
	
	
}
class CapitaleOne extends Bank {

//	public void InterestRate(){
//	System.out.println("9 percent");
//}

//	@Override
//	public void print() {      // gives compile error because its not an override method
//		
//	}
//	
	
	@Override
	public void InterestRate(){
		System.out.println("25 percent");
	}	
	
}















