package menuTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import booking.menue.BookingMenue;

class BookingMenueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		BookingMenue bookingMenue = BookingMenue.getInstance();
		bookingMenue.menu();
	}

}
