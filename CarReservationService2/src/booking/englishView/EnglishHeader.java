package booking.englishView;

import booking.structure.Head;

public class EnglishHeader extends Head {
	
	private String slogan = "Drive Better";
	private String companyName = "FamilyAutoRental";
	
//	public EnglishHeader() {
//		System.out.println("****************************************");
//		System.out.println(companyName + "\t" + slogan);
//		System.out.println("****************************************\n");
//		
//	}
	@Override
	public String printHeader() {
		String header = "****************************************\n";
		header += companyName + "\t" + slogan + "\n";
		header += "****************************************\n";
		return header;
	}

}
