package payment.structure;

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

import authentication.structure.UserNamePasswordStrategy;
import payment.behavior.AccountCreation;

public abstract class Payment {
	
	private Account senderAccount;
	public AccountCreation accounts = new AccountCreation();
	
	final public void bezahlen(long amountToPay) {
		senderAccount = clientAuthentification();
		bookAmount(senderAccount, amountToPay);
		createPaymentConfimation();
	}
	

	private Account clientAuthentification() {
		//TODO Account mit person verknüpfen und clientAuthentification mit dem account der bei person liegt abgleichen
		//TODO sender Account anschließend zurückgeben
		Scanner scanner = new Scanner(System.in);
		boolean authenticationStatus = false;
		Account senderAccount = null;
		
		do {
			System.out.println("Enter username from your Paymentaccount:");
			String inputUsername = scanner.nextLine();
			System.out.println("Enter password:");
			String inputPassword = scanner.nextLine();
		if(accounts.accountDictonary.containsKey(inputUsername) && accounts.accountDictonary.get(inputUsername).getAccountPassword().equals(inputPassword) ) {
			//TODO statt "allemeinepferdchen@web.de" muss da userNamePassword.getUsername hin
			senderAccount = accounts.accountDictonary.get(inputUsername);
		}
		else {
			System.out.println("Authentication unsuccessful!");
			System.out.println("Pls try again");
			authenticationStatus = true;
			
		}
		}
		while(authenticationStatus);
		
		return senderAccount;
	}
	
	//TODO überprüfen welcher accounttype vorliegt muss der gleicche sein
	protected abstract void bookAmount(Account senderAccount, long amountToPay);

	private void createPaymentConfimation() {
		
		System.out.println("Amount successfully send from ... to ...");
	}
	
}
