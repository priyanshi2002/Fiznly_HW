package practise;

 class Bank{
	private int accountNumber;
    private double balance;
    private String ownerName;

    public Bank(int accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }
   public  int getAccountNumber()
    {
    	return accountNumber;
    }
    void setAccountNumber(int accountNumber)
    {
    	this.accountNumber = accountNumber;
    }
    
    public String getOwnerName()
    {
    	return ownerName;
    }
    void setOwnerName(String ownerName)
    {
    	this.ownerName=ownerName;
    }
    public double getBalance()
    {
    	return balance;
    }
    void setBalance(double balance)
    {
    	this.balance=balance;
    }
    
    void deposite(double amount)
    {
    	balance= balance + amount;
    	System.out.println("Balance after depositing " +amount + "to account is "+balance);
		
    }
    void withDraw(double amount)
    {
    	balance= balance - amount;
    	System.out.println("Balance after withdrawing " +amount + "to account is "+balance);
    }
    
   
}

public class BankAccount {
    public static void main(String[] args) {
        Bank b = new Bank(123456789, "Priyanshi Verma");
        b.deposite(1000);
        b.withDraw(90);
        b.getBalance();
        System.out.println("Current balance: " + b.getBalance());
}
}
