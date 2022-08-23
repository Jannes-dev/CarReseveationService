package authentication.structure;

import java.util.Scanner;

public class Subject {
	private ICredential strategy = null;
	private String username;
	
	
	public void setStrategy(ICredential strategy) {
		this.strategy = strategy;
	}
	
	public void printConformatin() {
		strategy.printConfimation();
	}
}
