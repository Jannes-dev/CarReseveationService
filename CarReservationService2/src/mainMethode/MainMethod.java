package mainMethode;

import authentication.menue.AuthenticationMenue;
import booking.menue.BookingMenue;
import content.menue.ContentMenue;
import payment.menue.PaymentMenue;
import person.menue.Personmenue;
import resource.menue.ResourceMenue;

public class MainMethod {

	public static void main(String[] args) {
		
//		Personmenue personMenue = Personmenue.getInstance();
//		personMenue.menu();
//		
//		ResourceMenue resourceMenue = ResourceMenue.getInstance();
//		resourceMenue.menu();
//		
//		AuthenticationMenue authenticationMenue = new AuthenticationMenue();
//		authenticationMenue.menu();
//		//TODO authetifizierung durchführen (wie auch immer :()
//		
//		BookingMenue bookingMenue = BookingMenue.getInstance();
//		bookingMenue.menu();
		
//		PaymentMenue paymentMenue = PaymentMenue.getInstance();
//		paymentMenue.menu();
		
		ContentMenue contentMenue = ContentMenue.getInstance();
		contentMenue.menu();
		
	}

}
