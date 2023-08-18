package bank;

public class Main {
public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount("15374903", "Priyanshi Verma", 41000);
		sa.showDetails();
		System.out.println("The Total amount : "+sa.deposit(1000));
		System.out.println("The  Total Remaining amount : "+sa.withdraw(500));
		sa.showDetails();
		
		
		CheckingAccount ca = new CheckingAccount("83654271", "Priyanshi Verma", 5000,450);
		ca.showDetails();
		System.out.println("The Total amount : "+ca.deposit(1000));
		System.out.println("The Total Remaining amount : "+ca.withdraw(5000));
		ca.showDetails();
}
}
