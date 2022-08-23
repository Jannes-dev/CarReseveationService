package authentication.structure;

public class EyeScanStrategy implements ICredential {

	@Override
	public void printConfimation() {
		if(authetication()) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login not successful. Pls try again!");
		}
	}

	@Override
	public boolean authetication() {
//		iris scanen und mit datenbank abgleichen
//		falls übereinstimmg besteht return true;
//		else return false
		return true;
	}

}
