package booking.structure;

import java.util.Date;

import payment.structure.AccountType;
import person.structure.Person;
import resource.structure.ICar;

public interface IBuilder {
	void setHeader(Head head);
	void setAccountType(AccountType accountType);
	void setBookingDate(Date bookingDate);
	void setReturnDate(Date returnDate);
	void setBookingPerson(Person bookingPerson);
	void setResource(ICar car);
	void setFooter(Footer footer);
}
