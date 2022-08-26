package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import booking.englishView.EnglishFooter;
import booking.englishView.EnglishHeader;
import booking.germanView.GermanFooter;
import booking.germanView.GermanHeader;
import booking.structure.Director;
import booking.structure.EnglishBookingView;
import booking.structure.EnglishProductBuilder;
import booking.structure.EnglishViewBuilder;
import booking.structure.GermanBookingView;
import booking.structure.GermanProductBuilder;
import booking.structure.GermanViewBuilder;
import booking.structure.IBuilder;

class BookingTest {
	Director director;
	EnglishProductBuilder eBuilder;
	GermanProductBuilder gBuilder;
	@BeforeEach
	void setUp() throws Exception {
		director = new Director();
		eBuilder = new EnglishProductBuilder();
		gBuilder = new GermanProductBuilder();
	}

	@Test
	void test() {
		director.constructEnglishBookingView(eBuilder);
		EnglishBookingView englishBookingView = eBuilder.build();
		System.out.println(englishBookingView.printView());
		
		director.constructGermanBookingView(gBuilder);
		GermanBookingView germanBookingView = gBuilder.build();
		System.out.println(germanBookingView.printView());
	}

}
