package content.structure;

import booking.structure.EnglishBookingView;
import booking.structure.GermanBookingView;

public class File extends Knot {
	
	private EnglishBookingView englishBookingView;
	private GermanBookingView germanBookingView;
	
	public File(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operation() {
		String formatString; 
		 // Berechnen des Formatstrings fuer die Ausgabe von 
		 // Leerzeichen entsprechend der erreichten Ebene 
		 formatString = "%" + (ebene * 2) + "s"; 
		 // Ausgabe der Leerzeichen 
		 System.out.printf (formatString, ""); 
		 // Ausgabe eines Minuszeichens gefolgt vom Namen des Knotens 
		 System.out.println (" - " + super.gibName());
		
	}

}
