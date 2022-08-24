package booking.englishView;

import booking.structure.Head;

public class EnglishHeader extends Head {
	
	private String slogan = "Drive Better";
	private String companyName = "FamilyAutoRental";
	
	@Override
	protected void printHeader() {
		System.out.println("****************************************");
		System.out.println(companyName + "\t" + "\t" + slogan);
		System.out.println("****************************************");

	}

}
