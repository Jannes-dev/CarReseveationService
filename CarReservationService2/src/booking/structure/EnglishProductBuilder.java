package booking.structure;

import java.util.Date;

import payment.structure.AccountType;
import person.structure.Person;
import resource.structure.ICar;

public class EnglishProductBuilder implements IBuilder {
	
	//TODO variablen aus GermanBodyPruduct befüllen
	private Head header;
	private int bookingId;
	private int bookingAmount;
	private AccountType accountType;
	private Date bookingDate;
	private Date returnDate;
	private Person bookingPerson;
	private ICar car;
	private Footer footer;
	
	
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
	public void setBookingPerson(Person person) {
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
	
	public EnglishBookingView build() {
		return new EnglishBookingView(header, bookingId, bookingAmount, accountType, bookingDate, returnDate, bookingPerson, footer);
	}

	


}
