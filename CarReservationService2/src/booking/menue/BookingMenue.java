package booking.menue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import booking.englishView.EnglishFooter;
import booking.englishView.EnglishHeader;
import booking.germanView.GermanFooter;
import booking.germanView.GermanHeader;
import booking.structure.Director;
import booking.structure.EnglishBookingView;
import booking.structure.EnglishProductBuilder;
import booking.structure.GermanBookingView;
import booking.structure.GermanProductBuilder;
import payment.structure.AccountType;
import person.structure.LegalPerson;
import resource.structure.Limo;

public class BookingMenue {
	private static final BookingMenue bookingMenue = new BookingMenue();
	private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
	private int choice;
	private Scanner scanner = new Scanner(System.in);
	private Director director;
	private EnglishProductBuilder eBuilder;
	private GermanProductBuilder gBuilder;

	public Hashtable<Integer, GermanBookingView> germanBookingDictonary = new Hashtable<Integer, GermanBookingView>();
	public Hashtable<Integer, EnglishBookingView> englishBookingDictonary = new Hashtable<Integer, EnglishBookingView>();

	private BookingMenue() {
		createTestBookings();
	}

	

	public void menu() {
		int weiter = 0;
		director = new Director();
		eBuilder = new EnglishProductBuilder();
		gBuilder = new GermanProductBuilder();

		do {
			System.out.println("Was möchten sie tun?\n");
			System.out.println("um eine Buchung vorzunehmen geben sie eine 1 ein");
			System.out.println("if you like to book a car please enter a 2");
			System.out.println("um die Resevierungen angezeigt zu bekommen drücken sie die 3");
			System.out.println("If you like to see your resevation pls enter a 4");
			;
			choice = Integer.parseInt(scanner.nextLine());

			switch (choice) {
			case 1:
				director.constructGermanBookingView(gBuilder);
				GermanBookingView germanBookingView = gBuilder.build();
				germanBookingDictonary.put(germanBookingView.getBookingId(), germanBookingView);
				break;
			case 2:
				director.constructEnglishBookingView(eBuilder);
				EnglishBookingView englishBookingView = eBuilder.build();
				englishBookingDictonary.put(englishBookingView.getBookingId(), englishBookingView);
				break;
			case 3:
				if (!germanBookingDictonary.isEmpty()) {
					Set<Integer> keys = germanBookingDictonary.keySet();
					for (Integer key : keys) {
						GermanBookingView subject = germanBookingDictonary.get(key);
						System.out.println("Buchungsnummer: " + key);
						System.out.println(subject.printView());
					}
				} else
					System.out.println("Keine Buchungen Vorhanden!");
				break;
			case 4:
				if (!englishBookingDictonary.isEmpty()) {
					Set<Integer> keys = englishBookingDictonary.keySet();
					for (Integer key : keys) {
						EnglishBookingView subject = englishBookingDictonary.get(key);
						System.out.println("BookingId: " + key);
						System.out.println(subject.printView());
					}
				} else
					System.out.println("There are no reservations!");
				break;
			}
			System.out.println("Wenn sie eine Buchung ausführen wollen geben sie 1 ein, sonst 0:");
			weiter = Integer.parseInt(scanner.nextLine());
		} while (weiter == 1);
	}

	public static BookingMenue getInstance() {
		// TODO Auto-generated method stub
		return bookingMenue;
	}
	
	private void createTestBookings() {
		try {
			GermanBookingView germanTestBookingView = new GermanBookingView(new GermanHeader(), AccountType.PAYPAL,
					formatter.parse("11/10/2022"), formatter.parse("11/11/2022"),
					new LegalPerson(0, "Test", "Test", "Test", 0),
					new GermanFooter(), 
					new Limo());
			germanBookingDictonary.put(germanTestBookingView.getBookingId(), germanTestBookingView);
			
			GermanBookingView germanTestBookingView3 = new GermanBookingView(new GermanHeader(), AccountType.PAYPAL,
					formatter.parse("11/11/2022"), formatter.parse("11/12/2022"),
					new LegalPerson(0, "Test", "Test", "Test", 0),
					new GermanFooter(), 
					new Limo());
			germanBookingDictonary.put(germanTestBookingView3.getBookingId(), germanTestBookingView3);
			
			GermanBookingView germanTestBookingView2 = new GermanBookingView(new GermanHeader(), AccountType.PAYPAL,
					formatter.parse("11/10/2021"), formatter.parse("11/11/2021"),
					new LegalPerson(0, "Test", "Test", "Test", 0),
					new GermanFooter(), 
					new Limo());
			germanBookingDictonary.put(germanTestBookingView2.getBookingId(), germanTestBookingView2);
			
			GermanBookingView germanTestBookingView4 = new GermanBookingView(new GermanHeader(), AccountType.PAYPAL,
					formatter.parse("11/11/2021"), formatter.parse("11/11/2021"),
					new LegalPerson(0, "Test", "Test", "Test", 0),
					new GermanFooter(), 
					new Limo());
			germanBookingDictonary.put(germanTestBookingView4.getBookingId(), germanTestBookingView4);
			
			GermanBookingView germanTestBookingView6 = new GermanBookingView(new GermanHeader(), AccountType.PAYPAL,
					formatter.parse("11/11/2021"), formatter.parse("11/11/2021"),
					new LegalPerson(0, "Test", "Test", "Test", 0),
					new GermanFooter(), 
					new Limo());
			germanBookingDictonary.put(germanTestBookingView6.getBookingId(), germanTestBookingView6);
			
			EnglishBookingView englishTestBookingView = new EnglishBookingView(new EnglishHeader(), AccountType.PAYPAL,
					formatter.parse("11/10/2022"), formatter.parse("11/11/2022"),
					new LegalPerson(0, "Test", "Test", "Test", 0),
					new EnglishFooter(), 
					new Limo());
			englishBookingDictonary.put(englishTestBookingView.getBookingId(), englishTestBookingView);
			
			EnglishBookingView englishTestBookingView2 = new EnglishBookingView(new EnglishHeader(), AccountType.PAYPAL,
					formatter.parse("11/10/2021"), formatter.parse("11/11/2021"),
					new LegalPerson(0, "Test", "Test", "Test", 0),
					new EnglishFooter(), 
					new Limo());
			englishBookingDictonary.put(englishTestBookingView2.getBookingId(), englishTestBookingView2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
