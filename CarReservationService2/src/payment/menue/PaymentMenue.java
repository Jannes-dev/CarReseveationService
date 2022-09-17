package payment.menue;

import java.util.Set;

import booking.menue.BookingMenue;
import payment.structure.AccountType;
import payment.structure.PaymentGoogleWallet;
import payment.structure.PaymentMoneyWallet;
import payment.structure.PaymentPayPal;

public class PaymentMenue {

	private static final PaymentMenue paymentMenue = new PaymentMenue();
	private BookingMenue bookingMenue = BookingMenue.getInstance();
	
	private PaymentMenue() {
		
	}

	public static PaymentMenue getInstance() {
		// TODO Auto-generated method stub
		return paymentMenue;
	}

	public void menu() {
		if(!bookingMenue.germanBookingDictonary.isEmpty()) {
			Set<Integer> keys = bookingMenue.germanBookingDictonary.keySet();
			for(int key :keys) {
				AccountType accountType = bookingMenue.germanBookingDictonary.get(key).getAccountType();
				switch(accountType) {
				case GOOGLEWALLET:
					PaymentGoogleWallet paymentGoogleWallet = new PaymentGoogleWallet();
					paymentGoogleWallet.bezahlen(bookingMenue.germanBookingDictonary.get(key).getBookingAmount());
					bookingMenue.germanBookingDictonary.get(key).setPayed(true);
					break;
				case MONEYWALLET:
					PaymentMoneyWallet paymentMoneyWallet = new PaymentMoneyWallet();
					paymentMoneyWallet.bezahlen(bookingMenue.germanBookingDictonary.get(key).getBookingAmount());
					bookingMenue.germanBookingDictonary.get(key).setPayed(true);
					break;
				case PAYPAL:
					PaymentPayPal paymentPayPal = new PaymentPayPal();
					paymentPayPal.bezahlen(bookingMenue.germanBookingDictonary.get(key).getBookingAmount());
					bookingMenue.germanBookingDictonary.get(key).setPayed(true);
					break;
				}
			}
		}
		else {
			if(!bookingMenue.englishBookingDictonary.isEmpty()) {
			Set<Integer> keys = bookingMenue.englishBookingDictonary.keySet();
			for(int key :keys) {
				AccountType accountType = bookingMenue.englishBookingDictonary.get(key).getAccountType();
				switch(accountType) {
				case GOOGLEWALLET:
					PaymentGoogleWallet paymentGoogleWallet = new PaymentGoogleWallet();
					paymentGoogleWallet.bezahlen(bookingMenue.englishBookingDictonary.get(key).getBookingAmount());
					bookingMenue.englishBookingDictonary.get(key).setPayed(true);
					break;
				case MONEYWALLET:
					PaymentMoneyWallet paymentMoneyWallet = new PaymentMoneyWallet();
					paymentMoneyWallet.bezahlen(bookingMenue.englishBookingDictonary.get(key).getBookingAmount());
					bookingMenue.englishBookingDictonary.get(key).setPayed(true);
					break;
				case PAYPAL:
					PaymentPayPal paymentPayPal = new PaymentPayPal();
					paymentPayPal.bezahlen(bookingMenue.englishBookingDictonary.get(key).getBookingAmount());
					bookingMenue.englishBookingDictonary.get(key).setPayed(true);
					break;
				}
			}
		}
			else {
				System.out.println("Es sind keine Buchungen vorhanden die bezahlt werden müssen");
			}
	}
	}
}
