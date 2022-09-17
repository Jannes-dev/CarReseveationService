package payment.structure;

import java.util.Scanner;

import payment.behavior.AccountCreation;

public class PaymentPayPal extends Payment{

	@Override
	protected void bookAmount(Account senderAccount, long amountToPay) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter receiveraccountemail:");
		String receiverEmail = scanner.nextLine();
		Account receiverAccount = accounts.accountDictonary.get(receiverEmail);
		
		System.out.println("Do you want to pay " + amountToPay + " to " + receiverAccount.getAccountName());
		System.out.println("Enter y to continue or N if not");
		String choice = scanner.nextLine();
		switch(choice) {
		case "y":
			int temporaryAmount = senderAccount.getAccountAmount();
			temporaryAmount -= amountToPay;
			senderAccount.setAccountAmount(temporaryAmount);
			temporaryAmount = receiverAccount.getAccountAmount();
			temporaryAmount += amountToPay;
			receiverAccount.setAccountAmount(temporaryAmount);
			//TODO booking --> Variable für erfolgreiche zahlung erstellen und auf true setzen
			break;
		case "N":
			//TODO variable auf false lasse
			System.out.println("Payment canceled!");
		}
	}

}
