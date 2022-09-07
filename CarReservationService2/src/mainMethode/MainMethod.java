package mainMethode;

import authentication.menue.AuthenticationMenue;
import booking.menue.BookingMenue;
import person.menue.Personmenue;
import resource.menue.ResourceMenue;

public class MainMethod {

	public static void main(String[] args) {

//		
//		AuthenticationMenue authenticationMenue = new AuthenticationMenue();
//		authenticationMenue.menu();
		//TODO authetifizierung durchführen (wie auch immer :()
		
		BookingMenue bookingMenue = BookingMenue.getInstance();
		bookingMenue.menu();
		
	}

}
