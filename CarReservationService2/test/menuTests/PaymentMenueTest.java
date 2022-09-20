package menuTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import payment.menue.PaymentMenue;

class PaymentMenueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		PaymentMenue paymentMenue = PaymentMenue.getInstance();
		paymentMenue.menu();
	}

}
