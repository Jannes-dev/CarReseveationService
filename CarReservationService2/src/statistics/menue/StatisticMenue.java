package statistics.menue;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

import booking.menue.BookingMenue;
import booking.structure.EnglishBookingView;
import booking.structure.GermanBookingView;
import statistics.structure.StatisticDrucker;

public class StatisticMenue {

	BookingMenue bookingMenue = BookingMenue.getInstance();
	Hashtable<Integer, GermanBookingView> germanBookingDictonary = bookingMenue.germanBookingDictonary;
	Hashtable<Integer, EnglishBookingView> englishBookingDictonary = bookingMenue.englishBookingDictonary;
	private Scanner scanner = new Scanner(System.in);
	StatisticDrucker besucher = StatisticDrucker.getInstance();
	
	public StatisticMenue() {

		Set<Integer> germanKeys = germanBookingDictonary.keySet();
		for (Integer key : germanKeys) {
			germanBookingDictonary.get(key).akzeptieren(besucher);
		}

		Set<Integer> englishKeys = englishBookingDictonary.keySet();
		for (Integer key : englishKeys) {
			englishBookingDictonary.get(key).akzeptieren(besucher);
		}
	}
	
	public void menu() {
		int weiter = 0;
		
		do {
			
			System.out.println("Was möchten sie tun?\n");
			System.out.println("für deutsche Buchungen via PayPal geben sie eine 1 ein");
			System.out.println("für deutsche Buchungen via GoogleWallet geben sie eine 2 ein");
			System.out.println("für deutsche Buchungen via MoneyWallet geben sie eine 3 ein");
			System.out.println("for english bookings with PayPal pls enter a 4");
			System.out.println("for english bookings with GoogleWallet pls enter a 5");
			System.out.println("for english bookings with MoneyWallet pls enter a 6");
			int choice = Integer.parseInt(scanner.nextLine());
			
			switch (choice) {
			case 1:
				printGermanStatistic(besucher.germanPaypal);
				break;
			case 2:
				printGermanStatistic(besucher.germanGoogleWallet);
				break;
			case 3:
				printGermanStatistic(besucher.germanMoneyWallet);
				break;
			case 4:
				printEnglishStatistic(besucher.englishPayPal);
				break;
			case 5:
				printEnglishStatistic(besucher.englishGoolgeWallet);
				break;
			case 6:
				printEnglishStatistic(besucher.englishMoneyWallet);
				break;
			}
			
			System.out.println("Wenn sie eine weitere Statistic sehen wollen geben sie 1 ein, sonst 0:");
			weiter = Integer.parseInt(scanner.nextLine());
		}while(weiter == 1);
	}

	private void printEnglishStatistic(ArrayList<EnglishBookingView> englishBookings) {
		System.out.println("**************************************");
		System.out.println(englishBookings.size() + "bookings payed");
		for(EnglishBookingView englishBookingView : englishBookings) {
			String ausgabe = "";
			ausgabe += englishBookingView.getBookingId() + "\t";
			ausgabe += englishBookingView.getBookingAmount() + "\t";
			ausgabe += englishBookingView.getBookingDate() + "\t";
			System.out.println(ausgabe);
		}		
	}

	private void printGermanStatistic(ArrayList<GermanBookingView> germanBookings) {
		System.out.println("**************************************");
		System.out.println(germanBookings.size() + "Buchungen bezahlt");
		for(GermanBookingView germanBookingView : germanBookings) {
			String ausgabe = "";
			ausgabe += germanBookingView.getBookingId() + "\t";
			ausgabe += germanBookingView.getBookingAmount() + "\t";
			ausgabe += germanBookingView.getBookingDate() + "\t";
			System.out.println(ausgabe);
		}
		
	}

}
