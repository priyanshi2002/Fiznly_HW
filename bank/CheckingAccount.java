package bank;

public class CheckingAccount extends BankAccount
{
	public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
		
	}
	private double overdraftLimit;
    
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	@Override
	public double deposit(double amount) {
		
		balance += amount;
		return balance;
	}

	@Override
	public double withdraw(double amount) {
		
		if(amount <= 0 && amount >= overdraftLimit) {
			System.out.println("The account is overdrawn.");
		}
		else {
			balance -= amount;
			return balance;
		}
			
		return balance;
}
}