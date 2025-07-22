package JavaCodesDay3;

public class SavingsAccount extends BankAccountOverriding {
	private double minimumBalance;

    public SavingsAccount(String accountHolderName, double initial, double minimumBalance) {
        super(accountHolderName, initial);
        this.minimumBalance = minimumBalance;
    }

    
    
    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Cannot withdraw. Minimum balance requirement not met.");
        } else {
            balance -= amount;
            System.out.println("Savings withdrawal of " + amount + ". Remaining balance: " + balance);
        }
    }

    
    
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Minimum Required Balance: " + minimumBalance);
    }
}
	


