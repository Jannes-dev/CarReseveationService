package payment.structure;

import java.util.Scanner;

public class PaymentGoogleWallet extends Payment{

	@Override
	protected void bookAmount(Account senderAccount) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter IBAN:");
		String receiverIban = scanner.nextLine();
		Account receiverAccount = accounts.accountDictonary.get(receiverIban);
		
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
