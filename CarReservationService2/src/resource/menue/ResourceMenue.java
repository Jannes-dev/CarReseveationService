package resource.menue;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

import person.behaviour.KonkreterErzeugerLegalPerson;
import person.structure.LegalPerson;
import person.structure.NaturalPerson;
import person.structure.Person;
import resource.structure.ChildSeat;
import resource.structure.FamilyVan;
import resource.structure.ICar;
import resource.structure.Limo;
import resource.structure.SetTopBox;

public class ResourceMenue {
	private int choice;
	private Scanner scanner = new Scanner(System.in);
	public Hashtable<Integer, ICar> resourceDictonary = new Hashtable<Integer, ICar>();
	
	public void menu() {
		int weiter = 0;
		ICar newCar;
		
		do {
			int carId;
			
			System.out.println("Was möchten sie tun?\n");
			System.out.println("Um eine Limo zu erstellen geben sie eine 1 ein");
			System.out.println("Um einen FamilyVan zu erstellen geben sie eine 2 ein");
			System.out.println("Um ein Auto zu entfernen geben sie eine 3 ein");
			System.out.println("Um die Autos angezeigt zu bekommen drücken sie die 4");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("geben sie die Resourcen Id ein:");
				carId = scanner.nextInt();
				
				newCar = new Limo();
				newCar = addEquipment(newCar);
				
				resourceDictonary.put(carId, newCar);
				break;
			case 2:
				System.out.println("geben sie die Resourcen Id ein:");
				carId = scanner.nextInt();
				
				newCar = new FamilyVan();
				newCar = addEquipment(newCar);
				
				resourceDictonary.put(carId, newCar);
				break;
			case 3:
				System.out.println("Um ein Auto zu löschen geben sie bitte die Id des Autos ein: ");
				int temporaryIdNumber = scanner.nextInt();
				if(resourceDictonary.containsKey(temporaryIdNumber)) {
					resourceDictonary.remove(temporaryIdNumber);
				}
				else
					System.out.println("Resource ist unter dieser Nummer nicht vorhanden!");
					break;
			case 4:
				printPersonDictonary();
				break;
			}
			System.out.println("Wenn sie eine weitere Aktion ausführen wollen geben sie 1 ein:");
			weiter = scanner.nextInt();
		}while(weiter == 1);
	}

	private ICar addEquipment(ICar newCar) {
		int weiter = 0 ;
		do {
			System.out.println("um einen Kindersitz hinzuzufügen geben sie die 1 ein");
			System.out.println("um eine SetTopBox hinzuzufügen geben sie die 2 ein");
			System.out.println("wenn sie kein Equioment möchten geben sie eine 3 ein\n");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				newCar = new ChildSeat(newCar);
				//TODO eventuell hier hin moven --> "Wenn sie weiters Equipment hinzufügen möchten geben sie bit..."
				break;
			case 2:
				newCar = new SetTopBox(newCar);
				break;
			case 3:
				return newCar;
			}
			System.out.println("Wenn sie weiters Equipment hinzufügen möchten geben sie bitte eine 1 ein");
			weiter = scanner.nextInt();
			
		}while(weiter == 1);
		return newCar;
	}

	private void printPersonDictonary() {
		if(!resourceDictonary.isEmpty()) {
			Set<Integer> keys = resourceDictonary.keySet();
			for(int key : keys) {
				ICar printCar = resourceDictonary.get(key);
				
				System.out.println("_____________________________________");
				System.out.println("ResourcenId =\t" + key);
				System.out.println(printCar.showDetails()); 
				System.out.println("Price pro Tag in €:\t" + printCar.giveCosts()); 

			}
		}
		else
			System.out.println("Keine Resourcen Vorhanden!");
	}
}
