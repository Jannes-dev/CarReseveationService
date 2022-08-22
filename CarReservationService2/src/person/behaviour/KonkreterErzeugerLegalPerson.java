package person.behaviour;

import person.structure.LegalPerson;
import person.structure.Person;

public class KonkreterErzeugerLegalPerson extends Erzeuger {

	@Override
	public Person create() {
		// TODO Auto-generated method stub
		return new LegalPerson();
	}

	
}
