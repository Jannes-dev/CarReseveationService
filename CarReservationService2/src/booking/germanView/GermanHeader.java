package booking.germanView;

import booking.structure.Head;

public class GermanHeader extends Head {

	private String slogan = "FAHR BESSER!";
	private String companyName = "FamilyAutoRental";
	
	@Override
	protected void printHeader() {
		System.out.println("****************************************");
		System.out.println(companyName + "\t" + "\t" + slogan);
		System.out.println("****************************************");

	}

}
