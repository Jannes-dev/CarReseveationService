package test;

import org.junit.jupiter.api.Test;

import authentication.structure.EyeScanStrategy;
import authentication.structure.FingerPrintStrategy;
import authentication.structure.Subject;
import authentication.structure.UserNamePasswordStrategy;

class AutheticationTest {
	
	Subject subject;
	
	@Test
	void test() {
		subject = new Subject();
		
		subject.setStrategy(new EyeScanStrategy(), "Admin");
		subject.printConformatin();
		
		subject.setStrategy(new UserNamePasswordStrategy("Admin"), "Admin");
		subject.printConformatin();
		
		subject.setStrategy(new FingerPrintStrategy(), "Admin");
		subject.printConformatin();
	}

}
