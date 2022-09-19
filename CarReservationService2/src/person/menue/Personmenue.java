package person.menue;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

import person.behaviour.Erzeuger;
import person.behaviour.KonkreterErzeugerLegalPerson;
import person.behaviour.KonkreterErzeugerNatrualPerson;
import person.structure.Person;
import person.structure.LegalPerson;
import person.structure.NaturalPerson;

public class Personmenue {
	
	private static final Personmenue personmenue = new Personmenue();
	
	public Hashtable<Integer, Person> personDictonary = new Hashtable<Integer, Person>();
	
	private Personmenue() {
		LegalPerson legalPerson = new LegalPerson("Test", "Test", "Test", 0);
		personDictonary.put(legalPerson.getIdNumber(), legalPerson);
	}
	public void menu() {
		int weiter = 0;
		Scanner scanner = new Scanner(System.in);
		Erzeuger erzeuger;
		int choice;
		do {
			System.out.println("Was möchten sie tun?\n");
			System.out.println("um eine Natureleperson hinzuzufügen geben sie eine 1 ein");
			System.out.println("um eine Juristischeperson hinzuzufügen geben sie eine 2 ein");
			System.out.println("um eine Person zu löschen geben sie eine 3 ein");
			System.out.println("um die Personen angezeigt zu bekommen drücken sie die 4");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				erzeuger = new KonkreterErzeugerNatrualPerson();
				Person newNaturalPerson = erzeuger.create();
				personDictonary.put(newNaturalPerson.getIdNumber(), newNaturalPerson);
				break;
			case 2:
				erzeuger = new KonkreterErzeugerLegalPerson();
				Person newLegalPerson = erzeuger.create();
				personDictonary.put(newLegalPerson.getIdNumber(), newLegalPerson);
				break;
			case 3:
				System.out.println("Um die Person zu löschen geben sie bitte die IdNummer der Person ein: ");
				int temporaryIdNumber = scanner.nextInt();
				if(personDictonary.containsKey(temporaryIdNumber)) {
					personDictonary.remove(temporaryIdNumber);
				}
				else
					System.out.println("Person ist unter dieser Nummer nicht vorhanden!");
					break;
			case 4:
				printPersonDictonary();
				break;
			}
			System.out.println("Wenn sie eine weitere PersonenAktion ausführen wollen geben sie 1 ein, sonst 0:");
			weiter = scanner.nextInt();
		}while(weiter == 1);
	}

	private void printPersonDictonary() {
		if(!personDictonary.isEmpty()) {
			Set<Integer> keys = personDictonary.keySet();
			for(int key : keys) {
				Person printPerson = personDictonary.get(key);
				if(printPerson.getUnterklasse().equals("n")) {
					System.out.println("NaturalPerson: " + key + "\n");
					System.out.println("Name:\t" + ((NaturalPerson) printPerson).getName());
					System.out.println("Geschlecht:\t" + ((NaturalPerson) printPerson).getGender());
					System.out.println("City:\t" + ((NaturalPerson) printPerson).getCity());
					System.out.println("Address:\t" + ((NaturalPerson) printPerson).getAddress());
					System.out.println("zipCode:\t" + ((NaturalPerson) printPerson).getZipCode());
					System.out.println("Age:\t" + ((NaturalPerson) printPerson).getBirthday());
					System.out.println("Driverliscense:\t" + ((NaturalPerson) printPerson).getDriverLicense());
				}
				if(printPerson.getUnterklasse().equals("l")) {
					System.out.println("LegalPerson: " + key + "\n");
					System.out.println("Name:\t" + ((LegalPerson) printPerson).getName());
					System.out.println("City:\t" + ((LegalPerson) printPerson).getCity());
					System.out.println("Address:\t" + ((LegalPerson) printPerson).getAddress());
					System.out.println("zipCode:\t" + ((LegalPerson) printPerson).getZipCode());
				}
			}
		}
		else
			System.out.println("Keine Personen Vorhanden!");
	}

	public static Personmenue getInstance() {
		// TODO Auto-generated method stub
		return personmenue;
	}
}
