package classAndObject;

public class bankAccount {


		String AccountHolder;    // 3 attributes  
		long AccountNumber;
		double balance;
		
		
		public bankAccount() {
			
		}
		public bankAccount(String AcountHolder, long AccountNumber) {
			this.AccountHolder=AcountHolder;
			this.AccountNumber=AccountNumber;
		}
		
		
		
		//we have to create instance method:method that does not have static (specifier)does not have  return type
		// create method to show the balance
		public void Showbalance() {
			String acct=""+AccountNumber;                  // 3 methods =======> 3 actions
			String AccountNumber="***********"+acct.substring(12);
			System.out.println("AccountHolder: " +AccountHolder);
			System.out.println("Account Number: "+ AccountNumber);
			System.out.println("Available Balance: $"+balance);
			
				
		}

		public void Deposit(double amount) {
			System.out.println("----------------------------------------------------------");
			String acct=""+AccountNumber;                  // 3 methods =======> 3 actions
			String AccountNumber="***********"+acct.substring(12);
			String accountholder="Account holder : "+AccountHolder;
			System.out.println("depositing "+amount+" to account "+AccountNumber);
			balance+=amount;
		    System.out.println("The balance is "+balance);
	        System.out.println("-----------------------------------------------------------");
		}
		
		public void Withdraw(double amount) {
			System.out.println("----------------------------------------------------------");
			if(balance<=0) {
				System.out.println("there is no available balance");
				return;
			}
			String acct=""+AccountNumber;                  // 3 methods =======> 3 actions
			String AccountNumber="***********"+acct.substring(12);
			balance-=amount;
			if(balance<amount) {
				balance-=35;
			}
			System.out.println("the withdraw amount "+amount+"from the account"+AccountNumber);
		    System.out.println("The balance is "+balance);
		}
		
	
	
	
}
