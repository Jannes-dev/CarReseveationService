package booking.structure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import booking.englishView.EnglishFooter;
import booking.englishView.EnglishHeader;
import booking.germanView.GermanFooter;
import booking.germanView.GermanHeader;
import payment.structure.AccountType;
import person.menue.Personmenue;
import resource.menue.ResourceMenue;

public class Director {
	private Scanner scanner = new Scanner(System.in);
	private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
	private Personmenue personMenue = Personmenue.getInstance();
	private ResourceMenue resourceMenue = ResourceMenue.getInstance();
	
	public void constructEnglishBookingView(IBuilder builder) {
		builder.setHeader(new EnglishHeader());
		
		System.out.println("Enter your preferred paymentmethod (PAYPAL, GOOGLEWALLET, MONEYWALLET): ");
		String input = scanner.nextLine();
		builder.setAccountType(AccountType.valueOf(input));
		
		System.out.println("Enter your start date (dd/mm/yyyy):");
		input = scanner.nextLine();
		try {
			builder.setBookingDate(formatter.parse(input));
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter your return date (dd/mm/yyyy):");
		input = scanner.nextLine();
		try {
			builder.setReturnDate(formatter.parse(input));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter your person idNumber:");
		int personIdNumber = Integer.parseInt(scanner.nextLine());
		//Scanner einfügen um leute aus einem Dictonary abzufragen und alle vorher erstellten personen in einem Dictonary sammeln gnauso wie Resoucres 
		builder.setBookingPerson(personMenue.personDictonary.get(personIdNumber));
		
		System.out.println("Enter your resource idNumber:");
		int resourceIdNumber = Integer.parseInt(scanner.nextLine());
		builder.setResource(resourceMenue.resourceDictonary.get(resourceIdNumber));
		
		builder.setFooter(new EnglishFooter());
	}

	public void constructGermanBookingView(IBuilder builder) {
		builder.setHeader(new GermanHeader());
		
		System.out.println("Geben Sie ihre bevorzugte Bezahlungsmöglichkeit ein (PAYPAL, GOOGLEWALLET, MONEYWALLET): ");
		String input = scanner.nextLine();
		builder.setAccountType(AccountType.valueOf(input));
		
		System.out.println("Geben Sie ihr Anfangsdatum ein (dd/mm/yyyy):");
		input = scanner.nextLine();
		try {
			builder.setBookingDate(formatter.parse(input));
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("Geben Sie ihr Rückgabedatum ein (dd/mm/yyyy):");
		input = scanner.nextLine();
		try {
			builder.setReturnDate(formatter.parse(input));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Geben Sie ihr Personen idNumber ein:");
		int personIdNumber = Integer.parseInt(scanner.nextLine());
		//Scanner einfügen um leute aus einem Dictonary abzufragen und alle vorher erstellten personen in einem Dictonary sammeln gnauso wie Resoucres 
		builder.setBookingPerson(personMenue.personDictonary.get(personIdNumber));
		
		System.out.println("Geben Sie ihr Resourcen idNumber ein:");
		int resourceIdNumber = Integer.parseInt(scanner.nextLine());
		builder.setResource(resourceMenue.resourceDictonary.get(resourceIdNumber));
		
		builder.setFooter(new GermanFooter());
	}		

}
