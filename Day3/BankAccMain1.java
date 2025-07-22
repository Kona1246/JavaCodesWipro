package JavaCodesDay3;

public class BankAccMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountOverloading account1 = new BankAccountOverloading("Sayantani", 2000);
        account1.deposit(6000.50);     
        account1.withdraw(800);      
        account1.displayDetails();

        System.out.println();

       
        BankAccountOverloading account2 = new BankAccountOverloading("Sayantani");
        account2.deposit(900);         
        account2.withdraw(400);        
        account2.displayDetails();
    }


	}


