package person.behaviour;

import person.structure.NatrualPerson;
import person.structure.Person;

public class KonkreterErzeugerNatrualPerson extends Erzeuger{

	@Override
	public Person create() {
		return new NatrualPerson();
	}

}
