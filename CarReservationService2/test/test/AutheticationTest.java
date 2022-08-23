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
		
		subject.setStrategy(new EyeScanStrategy());
		subject.printConformatin();
		
		subject.setStrategy(new UserNamePasswordStrategy());
		subject.printConformatin();
		
		subject.setStrategy(new FingerPrintStrategy());
		subject.printConformatin();
	}

}
