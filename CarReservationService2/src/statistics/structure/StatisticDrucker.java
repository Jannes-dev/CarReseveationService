package statistics.structure;

import java.util.ArrayList;

import booking.structure.EnglishBookingView;
import booking.structure.GermanBookingView;
import payment.structure.AccountType;

public class StatisticDrucker extends StatisitcBesucher {
	
	private static final StatisticDrucker statisticDrucker = new StatisticDrucker();
	public ArrayList<GermanBookingView> germanPaypal = new ArrayList<GermanBookingView>();
	public ArrayList<GermanBookingView> germanGoogleWallet = new ArrayList<GermanBookingView>();
	public ArrayList<GermanBookingView> germanMoneyWallet = new ArrayList<GermanBookingView>();
	public ArrayList<EnglishBookingView> englishMoneyWallet = new ArrayList<EnglishBookingView>();
	public ArrayList<EnglishBookingView> englishGoolgeWallet = new ArrayList<EnglishBookingView>();
	public ArrayList<EnglishBookingView> englishPayPal = new ArrayList<EnglishBookingView>();
//	private int germanPayPal = 0;
//	private int germanGoogleWallet = 0;
//	private int germanMoneyWallet = 0;
//	private int englishPayPal = 0;
//	private int englishGoogleWallet = 0;
//	private int englishMoneyWallet = 0;
	
	private StatisticDrucker() {
		System.out.println("***************************************************");
		System.out.println("Statistics");
		System.out.println("***************************************************");
	}
	
	@Override
	public void besuchen(GermanBookingView germanBookingView) {
		AccountType paymentMethod = germanBookingView.getAccountType();
		switch(paymentMethod) {
		case PAYPAL:
			if(germanBookingView.getPaymentStatus()) {
				germanPaypal.add(germanBookingView);
			}
//			germanPayPal++;
			break;
		case GOOGLEWALLET:
			if(germanBookingView.getPaymentStatus()) {
				germanGoogleWallet.add(germanBookingView);
			}
//			germanGoogleWallet++;
			break;
		case MONEYWALLET:
			if(germanBookingView.getPaymentStatus()) {
				germanMoneyWallet.add(germanBookingView);
			}
//			germanMoneyWallet++;
			break;
		}
	}

	@Override
	public void besuchen(EnglishBookingView englishBookingView) {
		AccountType paymentMethod = englishBookingView.getAccountType();
		switch(paymentMethod) {
		case PAYPAL:
			if(englishBookingView.getPaymentStatus()) {
				englishPayPal.add(englishBookingView);
			}
//			englishPayPal++;
			break;
		case GOOGLEWALLET:
			if(englishBookingView.getPaymentStatus()) {
				englishGoolgeWallet.add(englishBookingView);
			}
//			englishGoogleWallet++;
			break;
		case MONEYWALLET:
			if(englishBookingView.getPaymentStatus()) {
				englishMoneyWallet.add(englishBookingView);
			}
//			englishMoneyWallet++;
			break;
		}		
	}
	
	public static StatisticDrucker getInstance() {
		return statisticDrucker;
	}

}
