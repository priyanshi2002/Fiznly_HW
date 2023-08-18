package bank;

 public class SavingsAccount extends BankAccount {

	 public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
			super(accountNumber, accountHolderName, balance);
			
		}
		private double InterestRate;
		 
		 
		public double getInterestRate() {
			return InterestRate;
		}

		public void setInterestRate(double interestRate) {
			InterestRate = interestRate;
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
		
		public double deposit(double amount) {
			
			balance += amount;
			return balance;
		}
		
		public double withdraw(double amount) {
			
			if(balance >= amount)
				balance -= amount;
				
				return balance;
		}
 }
