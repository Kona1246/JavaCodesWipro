package JavaCodesDay6;

public class SavingAccount implements Banks {

	
		
		private double balance;

	    // Constructor
	    public SavingAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	   
	    public double getBalance() {
	        return balance;
	    }

	   
	    public void deposit(double amount) {
	        balance += amount;
	    }

	   
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds to withdraw $" + amount);
	        }
	}
	   
	    public void displayAccountType() {
	        System.out.println("Account Type: Savings Account");
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        SavingAccount myAccount = new SavingAccount(1000);
	        myAccount.displayAccountType();
	        myAccount.executeTransaction("deposit", 500);
	        myAccount.executeTransaction("withdraw", 300);
	        myAccount.executeTransaction("withdraw", 1500); // Insufficient funds
	        myAccount.executeTransaction("bonus", 200);     // Invalid transaction
	    }
	

	}


