package payment.structure;

import java.util.Scanner;

public class PaymentMoneyWallet extends Payment{

	@Override
	protected void bookAmount(Account senderAccount, long amountToPay) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("The mobilnumber of the receiver is +49 111 111 11 111:");
		String receiverMobilNumber = "+49 111 111 11 111";
		Account receiverAccount = accounts.accountDictonary.get(receiverMobilNumber);
		
		System.out.println("Do you want to pay " + amountToPay + " to CarReservationFirma?");
		System.out.println("Enter y to continue or N if not");
		String choice = scanner.nextLine();
		switch(choice) {
		case "y":
			long temporaryAmount = senderAccount.getAccountAmount();
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

	@Override
	Account clientAuthentification() {
		//TODO Account mit person verknüpfen und clientAuthentification mit dem account der bei person liegt abgleichen
				//TODO sender Account anschließend zurückgeben
				Scanner scanner = new Scanner(System.in);
				boolean authenticationStatus = false;
				Account senderAccount = null;
				
				do {
					
					System.out.println("Enter mobilnumber from your paymentaccount:");
					String inputUsername = scanner.nextLine();
					System.out.println("Enter password:");
					String inputPassword = scanner.nextLine();
				if(accounts.accountDictonary.containsKey(inputUsername) && accounts.accountDictonary.get(inputUsername).getAccountPassword().equals(inputPassword) ) {
					//TODO statt "allemeinepferdchen@web.de" muss da userNamePassword.getUsername hin
					senderAccount = accounts.accountDictonary.get(inputUsername);
					authenticationStatus = false;
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

}
