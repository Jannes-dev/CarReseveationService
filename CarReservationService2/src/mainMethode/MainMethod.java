package mainMethode;

import authentication.menue.AuthenticationMenue;
import person.menue.Personmenue;
import resource.menue.ResourceMenue;

public class MainMethod {

	public static void main(String[] args) {
//		Personmenue personmenue = new Personmenue();
//		personmenue.menu();
		
//		ResourceMenue resourceMenue = new ResourceMenue();
//		resourceMenue.menu();
		
		AuthenticationMenue authenticationMenue = new AuthenticationMenue();
		authenticationMenue.menu();
	}

}
