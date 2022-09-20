package content.structure;

import booking.structure.EnglishBookingView;
import booking.structure.GermanBookingView;

public class File extends Knot {

	private EnglishBookingView englishBookingView = null;
	private GermanBookingView germanBookingView = null;

	public File(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public File(String name, GermanBookingView germanBookingView) {
		super(name);
		this.germanBookingView = germanBookingView;
	}

	public File(String name, EnglishBookingView englishBookingView) {
		super(name);
		this.englishBookingView = englishBookingView;
	}

	public File(String name, long amountPayed, long amountBooked) {
		super(name);
		
	}

	private String printGermanFileView() {
		String fileView = "";
		fileView += "\tBetrag = " + germanBookingView.getBookingAmount() + "\n";
		fileView += "\tBezahlStatus = " + germanBookingView.getPaymentStatus()+ "\n";
		return fileView;
	}

	@Override
	public void operation() {
		String formatString;
		// Berechnen des Formatstrings fuer die Ausgabe von
		// Leerzeichen entsprechend der erreichten Ebene
		formatString = "%" + (ebene * 2) + "s";
		// Ausgabe der Leerzeichen
		System.out.printf(formatString, "");
		// Ausgabe eines Minuszeichens gefolgt vom Namen des Knotens
		System.out.println(" - " + super.gibName());
		System.out.printf(formatString, "");
		if (germanBookingView != null) {
			System.out.println(printGermanFileView());
		}
		if(englishBookingView != null) {
			System.out.println(printEnglishView());
		}

	}

	private String printEnglishView() {
		String fileView = "";
		fileView += "\tAmount = " + englishBookingView.getBookingAmount() + "\n";
		fileView += "\tPaymentstatus = " + englishBookingView.getPaymentStatus()+ "\n";
		return fileView;
	}

}
