package booking.structure;

import java.util.Date;

import payment.structure.AccountType;
import person.structure.Person;
import resource.structure.ICar;

public class GermanProductBuilder implements IBuilder {
	
	private Head header;
	private int bookingId;
	private int bookingAmount;
	private Date bookingDate;
	private Date returnDate;
	private Person bookingPerson;
	private ICar car;
	private Footer footer;
	private AccountType accountType;
	
	@Override
	public void setHeader(Head head) {
		this.header = head;
	}

	@Override
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;

	}

	@Override
	public void setBookingamount(int bookingAmount) {
		this.bookingAmount = bookingAmount;

	}

	@Override
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;

	}

	@Override
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;

	}

	@Override
	public void setBookingPerson(Person bookingPerson) {
		this.bookingPerson = bookingPerson;

	}

	@Override
	public void setResource(ICar car) {
		this.car = car;

	}

	@Override
	public void setFooter(Footer footer) {
		this.footer = footer;

	}
	
	@Override
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public GermanBookingView build() {
		return new GermanBookingView(header, bookingId, bookingAmount, accountType, bookingDate, returnDate, bookingPerson, footer);
	}


}
