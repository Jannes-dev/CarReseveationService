package person.behaviour;

import java.util.Scanner;

import person.structure.NaturalPerson;
import person.structure.Person;

public class KonkreterErzeugerNatrualPerson extends Erzeuger{

	@Override
	public Person create() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter idNumber(int):");
		int idNumber = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter FirstName:");
		String firstName = scanner.nextLine();
		
		System.out.println("Enter LastName:");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter Gender:");
		String gender = scanner.nextLine();
		
		System.out.println("Enter Age(int):");
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter DriverLicense:");
		String driverLicense = scanner.nextLine();
		
		System.out.println("Enter City:");
		String city = scanner.nextLine();
		
		System.out.println("Enter Address:");
		String address = scanner.nextLine();
		
		
		System.out.println("Enter zipCode(int):");
		int zipCode = Integer.parseInt(scanner.nextLine());
		
		return new NaturalPerson(idNumber, firstName, lastName, gender, age, driverLicense, city, address, zipCode);
	}

}
