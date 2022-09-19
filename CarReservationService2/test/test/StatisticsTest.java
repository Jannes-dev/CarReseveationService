package test;

import java.util.Hashtable;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import booking.menue.BookingMenue;
import booking.structure.EnglishBookingView;
import booking.structure.GermanBookingView;
import statistics.structure.StatisticDrucker;

class StatisticsTest {
	
	BookingMenue bookingMenue = BookingMenue.getInstance();
	Hashtable<Integer, GermanBookingView> germanBookingDictonary = bookingMenue.germanBookingDictonary;
		Hashtable<Integer, EnglishBookingView> englishBookingDictonary = bookingMenue.englishBookingDictonary;
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void test() {
		StatisticDrucker besucher = StatisticDrucker.getInstance();
		
		Set<Integer> germanKeys = germanBookingDictonary.keySet();
		for(Integer key : germanKeys) {
			germanBookingDictonary.get(key).akzeptieren(besucher);
		}
		
		Set<Integer> englishKeys = englishBookingDictonary.keySet();
		for(Integer key : englishKeys) {
			englishBookingDictonary.get(key).akzeptieren(besucher);
		}
	}

}
