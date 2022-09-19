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
	

	abstract Account clientAuthentification();
	
	//TODO überprüfen welcher accounttype vorliegt muss der gleicche sein
	protected abstract void bookAmount(Account senderAccount, long amountToPay);

	private void createPaymentConfimation() {
		
		System.out.println("Amount successfully send from ... to ...");
	}
	
}
