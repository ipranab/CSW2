abstract class Account{
	private String accountNumber;
	protected double balance;
	
	public Account(String accountNumber , double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	
	public void displayAccountDetails() {
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Balance : $"+balance);
	}
}
class SavingsAccount extends Account{

	private double interestRate;
	
	public SavingsAccount(String accountNumber , double balance, double interestRate) {
		super(accountNumber,balance);
		this.interestRate = interestRate;
	}

	@Override
	void deposit(double amount) {
		if(amount == 0) System.out.println("The amount can't be zero(0)");
		else {
			balance += amount + (amount * interestRate / 100);
			System.out.println(amount+"$ is deposited to your bank.");			
		}
	}
	
	@Override
	void withdraw(double amount) {
		if(amount == 0) System.out.println("The amount can't be zero(0)");
		else if(amount > balance) System.out.println("Insufficent Balance");
		else {
			balance -= amount;
			System.out.println("$"+ amount + " withdrawn successfully");
		}
	}
}
class CurrentAccount extends Account{
	private double overdraftLimit;
	
	public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	void deposit(double amount) {
		if(amount == 0) System.out.println("The amount can't be zero(0)");
		else {
			System.out.println(amount+"$ is deposited into your bank.");
			balance += amount;
		}
	}
	
	@Override
	void withdraw(double amount) {
		if(amount == 0) System.out.println("The amount cannot be zero(0)");
		if(balance + overdraftLimit - amount >= 0) {
			balance -= amount;
			System.out.println("$"+ amount + " withdrawn successfully");
		}else {
			System.out.println("Exceeds overdraft limit.");
		}
	}
}
public class _8160_q7 {
    public static void main(String[] args) {
    	Account savingsAccount = new SavingsAccount("V093", 56000, 3.5);
    	Account currentAccount = new CurrentAccount("KA89",9000,900);
    	System.out.println("Initial Balance: ");
    	System.out.println("- Savings account - ");
    	displayAccountBalance(savingsAccount);
    	System.out.println("- Current account - ");
    	displayAccountBalance(currentAccount);
    	System.out.println("- Savings account transcation - ");
    	depositToAccount(savingsAccount, 600);
    	withdrawFromAccount(savingsAccount, 100);
    	System.out.println("- Current account transcation - ");
    	depositToAccount(currentAccount, 903);
    	withdrawFromAccount(currentAccount, 5900);
    	System.out.println("- Remaining balance -");
    	System.out.println("- Savings account - ");
    	displayAccountBalance(savingsAccount);
    	System.out.println("- Current account - ");
    	displayAccountBalance(currentAccount);
    }
    
    public static void depositToAccount(Account account, double amount) {
    	account.deposit(amount);
    }
    
    public static void withdrawFromAccount(Account account, double amount) {
    	account.withdraw(amount);
    }
    
    public static void displayAccountBalance(Account account) {
    	System.out.println("Current balance now : $"+account.balance);
    }
}
