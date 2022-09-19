package person.behaviour;

import java.util.Scanner;

import person.structure.LegalPerson;
import person.structure.Person;

public class KonkreterErzeugerLegalPerson extends Erzeuger {

	@Override
	public Person create() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter CompanyName:");
		String companyName = scanner.nextLine();
		
		System.out.println("Enter City:");
		String city = scanner.nextLine();
		
		System.out.println("Enter Address:");
		String address = scanner.nextLine();
		
		System.out.println("Enter zipCode(int):");
		int zipCode = Integer.parseInt(scanner.nextLine());
		
		return new LegalPerson(companyName, city, address, zipCode);
	}

	
}
