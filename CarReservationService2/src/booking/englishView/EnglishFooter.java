package booking.englishView;

import booking.structure.Footer;

public class EnglishFooter extends Footer {
	
	private String address = "Universit�tsallee 1, 21335 L�neburg";
	private String ceo = "Jannes";
	private String telephoneNumber = "04131 6770";
		
	@Override
	protected void printFooter() {
		System.out.println("****************************************");
		System.out.println(ceo + "\t" + address + "\t" + telephoneNumber);
		System.out.println("****************************************");

	}

}
