package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import payment.structure.PaymentGoogleWallet;
import payment.structure.PaymentMoneyWallet;
import payment.structure.PaymentPayPal;

class PaymentTest {
	
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		PaymentPayPal paymentPayPal = new PaymentPayPal();
		paymentPayPal.bezahlen(3000);
		
		PaymentGoogleWallet paymentGoogleWallet = new PaymentGoogleWallet();
		paymentGoogleWallet.bezahlen(3000);
		
		PaymentMoneyWallet paymentMoneyWallet = new PaymentMoneyWallet();
		paymentMoneyWallet.bezahlen(3000);
	}

}
