package menuTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import resource.menue.ResourceMenue;

class ResoursceMenueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		ResourceMenue resourceMenue = ResourceMenue.getInstance();
		resourceMenue.menu();
	}

}
