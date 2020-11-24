package day44_accessModifiers;

public class BankAccount {
	
	
	
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;
	
   //getter(read only ): instance return method ==> first step is getter by creating a getter method for each instance .
	public String getAccountHolder() {       // could be private too but we give public to be accessed from anywhere
		return AccountHolder;
	}

	public long getAccountNumber() {
		return AccountNumber;
	}
	
	public double getAvailableBalance() {
		return AvailableBalance;
	}
	
	//setter(to modify the data):the method that needs some extra information (argument) but no return needed
	//======>   instance void method, passes a parameter  
	
	public void setAccountHolder(String AccountHolder) {
		this.AccountHolder=AccountHolder;
	}
	public void setAccountNumber(long AccountNumber) {
	    this.AccountNumber=	AccountNumber;              // this() is calling constructor ...can not call instance 
	}

/*	public void setAvailableBalance(double AvailableBalance) {
	    this.AvailableBalance=AvailableBalance;
	    
	}
*/	    
	    // we can use this. only with object so if 
    // the method is static or static block we can not use the "this." keywords	
	         // because there is no instance variable in static...  for static method we must create an object
	// *******private means that is not accessible but we can change it******
	
	
	//Actions;
	// Deposit : method should asked me for the deposit amount
	
	public void deposit(double amount) {
		AvailableBalance +=amount;        
	}
	// withdraw: method should withdraw from the balance
	
	public void WithDraw(double amount) {
	   if(AvailableBalance<=0) {
		   System.out.println("your account balance is 0 or below");
		   return;
	   }
		if(amount>AvailableBalance) {
			AvailableBalance-=35;
		}
		
		AvailableBalance-=amount;
	}
	
	//checking balance:
	public void ShowBalance() {
		System.out.println("Available Balance :"+ AvailableBalance);
		
	}
	
	// get account Info : display account name number and available balance.
	
	public void getAccountInfo() {
		System.out.println("Name :"+AccountHolder);
		System.out.println("Account Number :"+AccountNumber);
		System.out.println("The balance :"+AvailableBalance);
	}
	
	
	
	
}
