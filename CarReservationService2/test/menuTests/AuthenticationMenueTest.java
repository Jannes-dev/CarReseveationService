package menuTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import authentication.menue.AuthenticationMenue;
import booking.menue.BookingMenue;
import content.menue.ContentMenue;
import payment.menue.PaymentMenue;
import statistics.menue.StatisticMenue;

class AuthenticationMenueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		AuthenticationMenue authenticationMenue = AuthenticationMenue.getInstance();
		authenticationMenue.menu();
		boolean loggedin = true;
		do {
			authenticationMenue.performAuthentification();
			if (authenticationMenue.isLoginSuccessful()) {
				loggedin = false;
			} else {
				System.out.println("Sie sind nicht eingeloggt");
			}
		} while (loggedin);
	}

}
