package booking.structure;

import java.util.Date;

import person.structure.Person;

public class GermanBookingView {
	private final Head header;
	private final int bookingId;
	private final int bookingAmount;
	private final Date bookingDate;
	private final Date returnDate;
	private final Person bookingPerson;
	private final Footer footer;
	
	public GermanBookingView(Head header, int bookingId, int bookingAmount, Date bookingDate, Date returnDate,
			Person bookingPerson, Footer footer) {
				this.header = header;
				this.bookingId = bookingId;
				this.bookingAmount = bookingAmount;
				this.bookingDate = bookingDate;
				this.returnDate = returnDate;
				this.bookingPerson = bookingPerson;
				this.footer = footer;
	}
	
	public String printView() {
		String view = "";
		view += header.printHeader();
		view += "Buchungsnummer: " + bookingId + "\n";
		view += "Preis: " + bookingAmount + "\n";
		view += "Buchungsdatum: " + bookingDate + "\n";
		view += "R�ckgabedatum: " + returnDate + "\n";
		view += "Vertragspartner: " + bookingPerson + "\n";
		view += footer.printFooter();
		
		return view;
	}
}
