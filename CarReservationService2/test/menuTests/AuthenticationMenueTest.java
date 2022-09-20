package menuTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import authentication.menue.AuthenticationMenue;

class AuthenticationMenueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		AuthenticationMenue authenticationMenue = AuthenticationMenue.getInstance();
		authenticationMenue.menu();
	}

}
