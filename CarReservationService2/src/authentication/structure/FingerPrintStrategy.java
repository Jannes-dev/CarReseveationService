package authentication.structure;

public class FingerPrintStrategy implements ICredential {

	@Override
	public boolean authetication() {
//		fingerabdruck abfragen und mit gespeicherten daten abfragen 
//		und dementsprechend true oder false zurückgeben
		return true;
	}

	@Override
	public void printConfimation() {
		if(authetication()) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login not successful. Pls try again!");
			printConfimation();
		}

	}

}
