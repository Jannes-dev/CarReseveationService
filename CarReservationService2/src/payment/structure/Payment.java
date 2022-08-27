package payment.structure;

import authentication.structure.UserNamePasswordStrategy;
import payment.behavior.AccountCreation;

public abstract class Payment {
	
	private Account senderAccount;
	public AccountCreation accounts = new AccountCreation();
	
	final public void bezahlen() {
		senderAccount = clientAuthentification();
		bookAmount(senderAccount);
		createPaymentConfimation();
	}
	

	private Account clientAuthentification() {
		//TODO Account mit person verknüpfen und clientAuthentification mit dem account der bei person liegt abgleichen
		//TODO sender Account anschließend zurückgeben
		
		UserNamePasswordStrategy userNamePassword = new UserNamePasswordStrategy();
		
		if(userNamePassword.authetication()) {
			//TODO statt "allemeinepferdchen@web.de" muss da userNamePassword.getUsername hin
			return accounts.accountDictonary.get("allemeinepferdchen@web.de");
		}
		else {
			System.out.println("Authentication unsuccessful!");
			return null;
		}
		 
	}
	//TODO überprüfen welcher accounttype vorliegt muss der gleicche sein
	protected abstract void bookAmount(Account senderAccount);

	private void createPaymentConfimation() {
		
		System.out.println("Amount successfully send from ... to ...");
	}
}
