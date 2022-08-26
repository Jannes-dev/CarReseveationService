package booking.structure;

import java.util.Date;

import person.structure.Person;

public class EnglishBookingView {
	
	private final Head header;
	private final int bookingId;
	private final int bookingAmount;
	private final Date bookingDate;
	private final Date returnDate;
	private final Person bookingPerson;
	private final Footer footer;
	
	public EnglishBookingView(Head header, int bookingId, int bookingAmount, Date bookingDate, Date returnDate,
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
		view += "BookingID: " + bookingId + "\n";
		view += "Amount to pay: " + bookingAmount + "\n";
		view += "Booking date: " + bookingDate + "\n";
		view += "Return date: " + returnDate + "\n";
		view += "Booking Person: " + bookingPerson + "\n";
		view += footer.printFooter();
		
		return view;
	}

}
