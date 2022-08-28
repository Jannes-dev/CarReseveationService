package content.structure;

import java.util.Iterator;

public class Folder extends Knot {

	public Folder(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void add(Knot knot) {
		this.childElement.add(knot);
	}
	
	public void remove(Knot knot) {
		for (Iterator<Knot> iter = childElement.iterator(); iter.hasNext();) {
			Knot f = (Knot) iter.next();
			if (f instanceof Folder) {
				((Folder) f).remove(knot);
				
			}
		}
		childElement.remove(knot);
	}
	
	@Override
	public void operation() {

		 String formatString; 
		 // Berechnen der neuen Ausgabe-Ebene 
		 ebene++; 
		 // Berechnen des Formatstrings fuer die Ausgabe von 
		 // Leerzeichen entsprechend der erreichten Ebene 
		 formatString = "%" + (ebene * 2) + "s"; 
		 // Ausgabe der Leerzeichen 
		 System.out.printf (formatString, ""); 
		 // Ausgabe eines Pluszeichens gefolgt vom Namen der Komponente 
		 System.out.println ("+ " + super.gibName() + ""); 
		 // Aufruf der Operation fuer alle Kindelemente 
		 for (Iterator<Knot> iter = childElement.iterator(); 
		 iter.hasNext();) 
		 { 
		 Knot f = (Knot) (iter.next()); 
		 f.operation(); 
		 } 
		 // Ausgabe-Ebene wieder zuruecksetzen 
		 --ebene; 
	}

}
