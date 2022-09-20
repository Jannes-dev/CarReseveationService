package payment.structure;

import java.util.Scanner;

public class PaymentGoogleWallet extends Payment {
	private Scanner scanner = new Scanner(System.in);

	@Override
	protected void bookAmount(Account senderAccount, long amountToPay) {

		System.out.println("Reciveriban is DE12 2222 2222 2222 2222 22:");
		String receiverIban = "DE12 2222 2222 2222 2222 22";
		Account receiverAccount = accounts.accountDictonary.get(receiverIban);

		System.out.println("Do you want to pay " + amountToPay + " to CarResevationFirma?");
		System.out.println("Enter y to continue or N if not");
		String choice = scanner.nextLine();
		switch (choice) {
		case "y":
			long temporaryAmount = senderAccount.getAccountAmount();
			temporaryAmount -= amountToPay;
			senderAccount.setAccountAmount(temporaryAmount);
			temporaryAmount = receiverAccount.getAccountAmount();
			temporaryAmount += amountToPay;
			receiverAccount.setAccountAmount(temporaryAmount);
			// TODO booking --> Variable für erfolgreiche zahlung erstellen und auf true
			// setzen
			break;
		case "N":
			// TODO variable auf false lasse
			System.out.println("Payment canceled!");
		}
	}

	@Override
	Account clientAuthentification() {
		// TODO Account mit person verknüpfen und clientAuthentification mit dem account
		// der bei person liegt abgleichen
		// TODO sender Account anschließend zurückgeben
		boolean authenticationStatus = false;
		Account senderAccount = null;
		System.out.println("Accountinformationen sind in der Klasse 'AccountCreation' vorhanden");
		do {

			System.out.println("Enter Iban from your Paymentaccount:");
			String inputUsername = scanner.nextLine();
			System.out.println("Enter password:");
			String inputPassword = scanner.nextLine();
			if (accounts.accountDictonary.containsKey(inputUsername)
					&& accounts.accountDictonary.get(inputUsername).getAccountPassword().equals(inputPassword)) {
				// TODO statt "allemeinepferdchen@web.de" muss da userNamePassword.getUsername
				// hin
				senderAccount = accounts.accountDictonary.get(inputUsername);
				authenticationStatus = false;
			} else {
				System.out.println("Authentication unsuccessful!");
				System.out.println("Pls try again");
				authenticationStatus = true;

			}
		} while (authenticationStatus);

		return senderAccount;
	}

}
