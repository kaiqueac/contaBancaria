package entities;

public class Account {
	private int numberAccount;
	private String nameAccount;
	private double depositValue;

	public Account(int numberAccount, String nameAccount, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		deposit(initialDeposit);
	}
	
	public Account(int numberAccount, String nameAccount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getNameAccount() {
		return nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

	public double getDepositValue() {
		return depositValue;
	}

	public void deposit(double amount) {
		depositValue += amount;
	}
	
	public void withdraw(double amount) {
		depositValue -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ numberAccount
				+ ", Holder: "
				+ nameAccount
				+ ", Balance: $ "
				+ String.format("%.2f", depositValue);		
	}
}

