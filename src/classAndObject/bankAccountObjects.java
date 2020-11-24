package classAndObject;

public class bankAccountObjects {

	public static void main(String[] args) {
		
		
		
		bankAccount account1= new bankAccount();
		account1.AccountHolder="Erhan Dolapci";
		account1.AccountNumber=1264355676554474L;    //16 digits , will show the last 4 digits
		
		account1.Showbalance();
		account1.Deposit(2000);
		account1.Deposit(8000);
		account1.Withdraw(5000);
		account1.Withdraw(5002);
		account1.Withdraw(100);
		
		System.out.println("************************************************************************************");
		
		bankAccount account2=new bankAccount();
		account2.AccountHolder="hisham ahloufous";
		account2.AccountNumber=9625635327273768L;
		
		account2.Showbalance();
		
		
		bankAccount account3=new bankAccount("karim",1927384637503728L);
		account3.Showbalance();
		account3.Deposit(5000);
		account3.Withdraw(450);
		
		
	}
	
	
	
	
	
}
