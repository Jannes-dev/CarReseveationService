package booking.structure;

import java.util.Date;

import person.structure.Person;

public class GermanBodyProduct {
	private int amount;
	private Date dateBooking;
	private Date dateReturn;
	private Person bookingPerson;
	
	public GermanBodyProduct(Person bookingPerson, Date dateBooking, Date dateReturn, int amount) {
		this.amount = amount;
		this.bookingPerson = bookingPerson;
		this.dateBooking = dateBooking;
		this.dateReturn = dateReturn;
	}
}
