package menuTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import person.menue.Personmenue;

class PersonMenueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Personmenue personMenue = Personmenue.getInstance();
		personMenue.menu();
	}

}
