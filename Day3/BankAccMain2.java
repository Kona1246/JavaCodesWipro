package JavaCodesDay3;

public class BankAccMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountOverriding acc1 = new BankAccountOverriding("Sayantani", 2000);
        acc1.deposit(1000);
        acc1.withdraw(400);
        acc1.displayDetails();

        System.out.println();

        SavingsAccount acc2 = new SavingsAccount("Sayantani", 5000, 1000);
        acc2.deposit(1000);
        acc2.withdraw(5500); 
        acc2.withdraw(4000);
        acc2.displayDetails();
    }


	}


