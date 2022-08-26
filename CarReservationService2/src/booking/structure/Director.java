package booking.structure;

import booking.englishView.EnglishFooter;
import booking.englishView.EnglishHeader;
import booking.germanView.GermanFooter;
import booking.germanView.GermanHeader;

public class Director {
	
	public void constructEnglishBookingView(IBuilder builder) {
		builder.setHeader(new EnglishHeader());
		//TODO Scanner an irgendeinerstelle einfügen
		builder.setBookingId(0);
		builder.setBookingamount(0);
		builder.setBookingDate(null);
		builder.setReturnDate(null);
		//Scanner einfügen um leute aus einem Dictonary abzufragen und alle vorher erstellten personen in einem Dictonary sammeln gnauso wie Resoucres 
		builder.setBookingPerson(null);
		builder.setResource(null);
		builder.setFooter(new EnglishFooter());
	}

	public void constructGermanBookingView(IBuilder builder) {
		builder.setHeader(new GermanHeader());
		//TODO Scanner an irgendeinerstelle einfügen
		builder.setBookingId(0);
		builder.setBookingamount(0);
		builder.setBookingDate(null);
		builder.setReturnDate(null);
		//Scanner einfügen um leute aus einem Dictonary abzufragen und alle vorher erstellten personen in einem Dictonary sammeln gnauso wie Resoucres 
		builder.setBookingPerson(null);
		builder.setResource(null);
		builder.setFooter(new GermanFooter());
	}		

}
