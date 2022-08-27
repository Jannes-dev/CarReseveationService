package payment.structure;

import java.util.Scanner;

public class PaymentMoneyWallet extends Payment{

	@Override
	protected void bookAmount(Account senderAccount) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the mobilnumber of the receiver:");
		String receiverMobilNumber = scanner.nextLine();
		Account receiverAccount = accounts.accountDictonary.get(receiverMobilNumber);
		
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
