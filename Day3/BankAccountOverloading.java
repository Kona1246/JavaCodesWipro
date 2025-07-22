package JavaCodesDay3;

public class BankAccountOverloading {
	private String accountHolderName;
    private double balance;

    
    public BankAccountOverloading(String accountHolderName, double initial) {
        this.accountHolderName = accountHolderName;
        this.balance = initial; 
    }

    
    public BankAccountOverloading(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

   
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited (int): " + amount + ". New balance: " + balance);
    }

   
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        }
    }

    
    public void withdraw(int amount) {
        withdraw((double) amount); 
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}


