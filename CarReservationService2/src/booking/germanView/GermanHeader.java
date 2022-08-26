package booking.germanView;

import booking.structure.Head;

public class GermanHeader extends Head {

	private String slogan = "FAHR BESSER!";
	private String companyName = "FamilyAutoRental";
	
//	public GermanHeader() {
//		System.out.println("****************************************");
//		System.out.println(companyName + "\t" + slogan );
//		System.out.println("****************************************\n");
//	}
	@Override
	public String printHeader() {
		String header = "****************************************\n";
		header += companyName + "\t" + slogan + "\n";
		header += "****************************************\n";
		return header;
	}

}
