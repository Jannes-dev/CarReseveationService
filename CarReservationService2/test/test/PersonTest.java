package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import person.behaviour.Erzeuger;
import person.behaviour.KonkreterErzeugerLegalPerson;
import person.structure.Person;

class PersonTest {
	
	private Erzeuger personSystem;
	
	@BeforeEach
	void setUp() throws Exception {
		personSystem = new KonkreterErzeugerLegalPerson();
		
	}


	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void test() {
		personSystem.create();
	}

}
