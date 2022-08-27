package payment.structure;

import java.util.Scanner;

import payment.behavior.AccountCreation;

public class PaymentPayPal extends Payment{

	@Override
	protected void bookAmount(Account senderAccount) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter receiveraccountemail:");
		String receiverEmail = scanner.nextLine();
		Account receiverAccount = accounts.accountDictonary.get(receiverEmail);
		
		System.out.println("Enter amount: ");
		int inputAmount = scanner.nextInt();
		
		int temporaryAmount = senderAccount.getAccountAmount();
		temporaryAmount -= inputAmount;
		senderAccount.setAccountAmount(temporaryAmount);
		temporaryAmount = receiverAccount.getAccountAmount();
		temporaryAmount += inputAmount;
		receiverAccount.setAccountAmount(temporaryAmount);
	}

}
