package JavaCodesDay3;

public class BankAccountOverriding {
	protected String accountHolderName;
    protected double balance;

    public BankAccountOverriding(String accountHolderName, double initial) {
        this.accountHolderName = accountHolderName;
        this.balance = initial; 
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount; 
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}


