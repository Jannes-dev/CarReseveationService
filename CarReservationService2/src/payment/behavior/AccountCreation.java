package payment.behavior;

import java.util.Hashtable;

import payment.structure.Account;
import payment.structure.AccountType;

public class AccountCreation {

	public Hashtable<String, Account> accountDictonary = new Hashtable<String, Account>();
	
	public AccountCreation() {
		Account paypalAccount1 = new Account();
		paypalAccount1.setAccountName("allemeineentchen@web.de");
		paypalAccount1.setAccountType(AccountType.PAYPAL);
		paypalAccount1.setAccountAmount(3000);
		accountDictonary.put(paypalAccount1.getAccountName(), paypalAccount1);
		
		Account paypalAccount2 = new Account();
		paypalAccount2.setAccountName("allemeinepferdchen@web.de");
		paypalAccount2.setAccountType(AccountType.PAYPAL);
		paypalAccount2.setAccountAmount(3000);
		accountDictonary.put(paypalAccount2.getAccountName(), paypalAccount2);
		
		Account googleWalletAccount1 = new Account();
		googleWalletAccount1.setAccountName("DE12 1234 1234 1234 1234 00");
		googleWalletAccount1.setAccountType(AccountType.GOOGLEWALLET);
		googleWalletAccount1.setAccountAmount(3000);
		accountDictonary.put(googleWalletAccount1.getAccountName(), googleWalletAccount1);
		
		Account googleWalletAccount2 = new Account();
		googleWalletAccount2.setAccountName("DE12 1234 1234 1234 1234 11");
		googleWalletAccount2.setAccountType(AccountType.GOOGLEWALLET);
		googleWalletAccount2.setAccountAmount(3000);
		accountDictonary.put(googleWalletAccount2.getAccountName(), googleWalletAccount2);
		
		Account moneyWalletAccount1 = new Account();
		moneyWalletAccount1.setAccountName("+49 176 521 41 551");
		moneyWalletAccount1.setAccountType(AccountType.GOOGLEWALLET);
		moneyWalletAccount1.setAccountAmount(3000);
		accountDictonary.put(moneyWalletAccount1.getAccountName(), moneyWalletAccount1);
		
		Account moneyWalletAccount2 = new Account();
		moneyWalletAccount2.setAccountName("+49 176 521 41 666");
		moneyWalletAccount2.setAccountType(AccountType.GOOGLEWALLET);
		moneyWalletAccount2.setAccountAmount(3000);
		accountDictonary.put(moneyWalletAccount2.getAccountName(), moneyWalletAccount2);
		
	}
	
	
	
	
	
	
}
