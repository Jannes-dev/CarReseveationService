package mainMethode;

import java.util.Scanner;

import authentication.menue.AuthenticationMenue;
import booking.menue.BookingMenue;
import content.menue.ContentMenue;
import payment.menue.PaymentMenue;
import person.menue.Personmenue;
import resource.menue.ResourceMenue;
import statistics.menue.StatisticMenue;

public class MainMethod {
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Personmenue personMenue = Personmenue.getInstance();
		personMenue.menu();
		
		ResourceMenue resourceMenue = ResourceMenue.getInstance();
		resourceMenue.menu();
		
		AuthenticationMenue authenticationMenue = AuthenticationMenue.getInstance();
		authenticationMenue.menu();

		boolean loggedin = true;
		do {
			authenticationMenue.performAuthentification();
			if (authenticationMenue.isLoginSuccessful()) {

				BookingMenue bookingMenue = BookingMenue.getInstance();
				bookingMenue.menu();

				PaymentMenue paymentMenue = PaymentMenue.getInstance();
				paymentMenue.menu();

				ContentMenue contentMenue = ContentMenue.getInstance();
				contentMenue.menu();

				StatisticMenue statisticMenue = new StatisticMenue();
				statisticMenue.menu();

				loggedin = false;
			} else {
				System.out.println("Sie sind nicht eingeloggt");
			}
		} while (loggedin);

	}

}
