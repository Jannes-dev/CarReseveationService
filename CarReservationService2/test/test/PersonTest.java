package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import person.behaviour.Erzeuger;
import person.behaviour.KonkreterErzeugerLegalPerson;
import person.structure.Person;

class PersonTest {
	
	private Erzeuger erzeuger;
	private Person person;
	
	@BeforeEach
	void setUp() throws Exception {
		erzeuger = new KonkreterErzeugerLegalPerson();
		
	}


	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void test() {
		person = erzeuger.create();
		System.out.println(person.getName());
		System.out.println(person.getAddress());
		
	}

}
