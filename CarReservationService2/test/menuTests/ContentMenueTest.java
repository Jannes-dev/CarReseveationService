package menuTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import content.menue.ContentMenue;

class ContentMenueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		ContentMenue contentMenue = ContentMenue.getInstance();
		contentMenue.menu();
	}

}
