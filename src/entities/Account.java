package entities;

public class Account {
	private int numberAccount;
	private String nameAccount;
	private double depositValue;
	// opção if
	public Account(int numberAccount, String nameAccount, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		deposit(initialDeposit);
	}
	// opção else
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
	// valor a ser depositado
	public void deposit(double amount) {
		depositValue += amount;
	}
	// valor a ser sacado com taxa de $ 5.0
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

