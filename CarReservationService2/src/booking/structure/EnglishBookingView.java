package booking.structure;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import payment.structure.AccountType;
import person.structure.Person;
import resource.structure.ICar;
import statistics.structure.StatisitcBesucher;

public class EnglishBookingView extends BookingView {
	
	private final Head header;
	private static int bookingId = 0;
	private final int actualBookingId;
	private final long bookingAmount;
	private final AccountType accountType;
	private final Date bookingDate;
	private final Date returnDate;
	private final Person bookingPerson;
	private final Footer footer;
	private final ICar car;
	private boolean payed = false;
	
	public EnglishBookingView(Head header, AccountType accountType, Date bookingDate, Date returnDate,
			Person bookingPerson, Footer footer, ICar car) {
				this.header = header;
				EnglishBookingView.bookingId++;
				this.actualBookingId = bookingId;
				this.car = car;
				this.accountType = accountType;
				this.bookingDate = bookingDate;
				this.returnDate = returnDate;
				this.bookingPerson = bookingPerson;
				this.bookingAmount = (long) (TimeUnit.DAYS.convert(Math.abs(returnDate.getTime()- bookingDate.getTime()), TimeUnit.MILLISECONDS) * car.giveCosts()) ;
				this.footer = footer;
	}
	
	public String printView() {
		String view = "";
		view += header.printHeader();
//		view += "BookingID: " + bookingId + "\n";
		view += "Amount to pay: " + bookingAmount + "\n";
		view += "Payment method: " + accountType + "\n";
		view += "Booking date: " + bookingDate + "\n";
		view += "Return date: " + returnDate + "\n";
		view += "Booking Person: " + bookingPerson.getName() + "\n";
		view += footer.printFooter();
		
		return view;
	}

	public Integer getBookingId() {
		// TODO Auto-generated method stub
		return actualBookingId;
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

	public boolean getPaymentStatus() {
		// TODO Auto-generated method stub
		return payed;
	}

	@Override
	public void akzeptieren(StatisitcBesucher statisticBesucher) {
		statisticBesucher.besuchen(this);
		
	}

}
