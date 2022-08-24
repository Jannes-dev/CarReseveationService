package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import booking.englishView.EnglishFooter;
import booking.englishView.EnglishHeader;
import booking.germanView.GermanFooter;
import booking.germanView.GermanHeader;
import booking.structure.EnglishViewBuilder;
import booking.structure.GermanViewBuilder;
import booking.structure.IBuilderBooking;

class BookingTest {
	
	IBuilderBooking builder;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		//TODO director für den Body bauen
		builder = new EnglishViewBuilder(new EnglishHeader(), new EnglishBody(), new EnglishFooter());
		builder.printView();
		builder = new GermanViewBuilder(new GermanHeader(), new GermanBody(), new GermanFooter());
		builder.printView();
		
	}

}
