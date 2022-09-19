package payment.behavior;

import java.util.Hashtable;

import payment.structure.Account;
import payment.structure.AccountType;

public class AccountCreation {

	public Hashtable<String, Account> accountDictonary = new Hashtable<String, Account>();
	
	public AccountCreation() {
		Account paypalAccount1 = new Account();
		paypalAccount1.setAccountName("paypal@test.de");
		paypalAccount1.setAccountPassword("admin");
		paypalAccount1.setAccountType(AccountType.PAYPAL);
		paypalAccount1.setAccountAmount(300000000);
		accountDictonary.put(paypalAccount1.getAccountName(), paypalAccount1);
		
		Account paypalAccountCarReservation = new Account();
		paypalAccountCarReservation.setAccountName("carReservation@test.de");
		paypalAccountCarReservation.setAccountPassword("admin");
		paypalAccountCarReservation.setAccountType(AccountType.PAYPAL);
		paypalAccountCarReservation.setAccountAmount(300);
		accountDictonary.put(paypalAccountCarReservation.getAccountName(), paypalAccountCarReservation);
		
		Account googleWalletAccount1 = new Account();
		googleWalletAccount1.setAccountName("DE12 1111 1111 1111 1111 11");
		googleWalletAccount1.setAccountPassword("admin");
		googleWalletAccount1.setAccountType(AccountType.GOOGLEWALLET);
		googleWalletAccount1.setAccountAmount(300000000);
		accountDictonary.put(googleWalletAccount1.getAccountName(), googleWalletAccount1);
		
		Account googleWalletAccountCarReservation = new Account();
		googleWalletAccountCarReservation.setAccountName("DE12 2222 2222 2222 2222 22");
		googleWalletAccountCarReservation.setAccountPassword("admin");
		googleWalletAccountCarReservation.setAccountType(AccountType.GOOGLEWALLET);
		googleWalletAccountCarReservation.setAccountAmount(3000);
		accountDictonary.put(googleWalletAccountCarReservation.getAccountName(), googleWalletAccountCarReservation);
		
		Account moneyWalletAccount1 = new Account();
		moneyWalletAccount1.setAccountName("+49 222 222 22 222");
		moneyWalletAccount1.setAccountPassword("admiN");
		moneyWalletAccount1.setAccountType(AccountType.GOOGLEWALLET);
		moneyWalletAccount1.setAccountAmount(300000000);
		accountDictonary.put(moneyWalletAccount1.getAccountName(), moneyWalletAccount1);
		
		Account moneyWalletAccountCarReservation = new Account();
		moneyWalletAccountCarReservation.setAccountName("+49 111 111 11 111");
		moneyWalletAccountCarReservation.setAccountPassword("admiN");
		moneyWalletAccountCarReservation.setAccountType(AccountType.GOOGLEWALLET);
		moneyWalletAccountCarReservation.setAccountAmount(3000);
		accountDictonary.put(moneyWalletAccountCarReservation.getAccountName(), moneyWalletAccountCarReservation);
		
	}
	
	
	
	
	
	
}
