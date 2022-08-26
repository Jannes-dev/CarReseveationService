package booking.englishView;

import booking.structure.Footer;

public class EnglishFooter extends Footer {
	
	private String address = "Universitätsallee 1, 21335 Lüneburg";
	private String ceo = "Jannes";
	private String telephoneNumber = "04131 6770";
	
//	public EnglishFooter() {
//		System.out.println("****************************************");
//		System.out.println(ceo + "\t" + address + "\t" + telephoneNumber);
//		System.out.println("****************************************\n");
//	}
	@Override
	public String printFooter() {
		String footer = "****************************************\n";
		footer += ceo + "\t" + address + "\t" + telephoneNumber + "\n";
		footer += "****************************************\n";
		return footer;
		
	}

}
