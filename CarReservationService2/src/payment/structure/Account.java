package payment.structure;

public class Account {
	private String accountName;
	private String accountPassword;
	private AccountType accountType;
	private long accountAmount = 0;
	//TODO add person and authettication
	
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public long getAccountAmount() {
		return accountAmount;
	}
	public void setAccountAmount(long temporaryAmount) {
		this.accountAmount = temporaryAmount;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
}
