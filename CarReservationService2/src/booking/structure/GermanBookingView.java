package booking.structure;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import payment.structure.AccountType;
import person.structure.Person;
import resource.structure.ICar;

public class GermanBookingView {
	private final Head header;
	private static int bookingId = 0;
	private int actualBookingId;
	private final long bookingAmount;
	private final AccountType accountType;
	private final Date bookingDate;
	private final Date returnDate;
	private final Person bookingPerson;
	private final ICar car;
	private final Footer footer;
	private boolean payed = false;
	
	public GermanBookingView(Head header, AccountType accountType, Date bookingDate, Date returnDate,
			Person bookingPerson, Footer footer, ICar car) {
				this.header = header;
				GermanBookingView.bookingId++;
				setActualBookingId(bookingId);
				this.car = car;
				this.accountType = accountType;
				this.bookingDate = bookingDate;
				this.returnDate = returnDate;
				this.bookingPerson = bookingPerson;
				this.bookingAmount = (long) (TimeUnit.DAYS.convert(Math.abs(returnDate.getTime()- bookingDate.getTime()), TimeUnit.MILLISECONDS) * car.giveCosts());
				this.footer = footer;
	}
	
	public String printView() {
		String view = "";
		view += header.printHeader();
//		view += "Buchungsnummer: " + bookingId + "\n";
		view += "Preis: " + bookingAmount + "\n";
		view += "Bezahlmethode: " + accountType + "\n";
		view += "Buchungsdatum: " + bookingDate + "\n";
		view += "Rückgabedatum: " + returnDate + "\n";
		view += "Vertragspartner: " + bookingPerson.getName() + "\n";
		view += footer.printFooter();
		
		return view;
	}
	
	public int getBookingId() {
		return this.actualBookingId;
	}
	
	public AccountType getAccountType() {
		return this.accountType;
	}
	
	public long getBookingAmount() {
		return this.bookingAmount;
	}

	public boolean isPayed() {
		return payed;
	}

	public void setPayed(boolean payed) {
		this.payed = payed;
	}

	public Date getBookingDate() {
		// TODO Auto-generated method stub
		return bookingDate;
	}

	private void setActualBookingId(int actualBookingId) {
		this.actualBookingId = actualBookingId;
	}
	
	public boolean getPaymentStatus() {
		return payed;
	}
}
