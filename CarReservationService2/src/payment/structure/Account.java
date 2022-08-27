package payment.structure;

public class Account {
	private String accountName;
	private AccountType accountType;
	private int accountAmount = 0;
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
	public int getAccountAmount() {
		return accountAmount;
	}
	public void setAccountAmount(int accountAmount) {
		this.accountAmount = accountAmount;
	}
}
