package day44_accessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {

	public static void main(String[] args) {
		
		BankAccount Sarah=new BankAccount();
		Sarah.setAccountHolder("Sarah Abdujabbar");   // we call the setter first read the variable then
		Sarah.setAccountNumber(125334298363L);
		
		Sarah.deposit(2000);  // we call all (variable , method) through the object
		Sarah.WithDraw(2500);
		
		
		
		System.out.println(Sarah.getAccountHolder());  // we call getter to print the variable
		System.out.println(Sarah.getAccountNumber());
		System.out.println("available : "+Sarah.getAvailableBalance());
		
		System.out.println("***************************************");
		
		BankAccount Serkan=new BankAccount();
		
	Serkan.setAccountHolder("Serkan goldberg");   // we call the setter first read the variable then
		Serkan.setAccountNumber(924043336798L);
		
		
		/*
		System.out.println(Serkan.getAccountHolder());  // we call getter to print the variable
		System.out.println(Serkan.getAccountNumber());
		System.out.println("available : "+Serkan.getAvailableBalance());
		*/
		
		// to be easy we can use the getInfo method
		Serkan.getAccountInfo();
		
		Serkan.deposit(900);
		Serkan.ShowBalance();
		Serkan.WithDraw(400);
		Serkan.getAccountInfo();
		
		
		BankAccount[]accounts= {Sarah,Serkan};
		ArrayList<BankAccount>Accounts=new ArrayList<>();
		Accounts.add(Sarah);
		Accounts.add(Serkan);
	//	Accounts.addAll(Arrays.asList(Sarah,Serkan));
		
		
		
		
	}
	
	
}
