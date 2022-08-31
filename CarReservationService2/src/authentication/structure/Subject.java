package authentication.structure;

public class Subject {
	private ICredential strategy = null;
	private String username;
	
	
	public void setStrategy(ICredential strategy, String username) {
		this.strategy = strategy;
		this.username = username;
	}
	
	public ICredential getStrategy() {
		return this.strategy;
	}
	
	public void printConformatin() {
		this.strategy.printConfimation();
	}

	public String getUsername() {
		return username;
	}

}
