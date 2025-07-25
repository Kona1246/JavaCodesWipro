package JavaCodesDay6;

public class BankTest {

	public static void main(String[] args) {
		
		 MyBank account = new MyBank();
	        account.displayAccountType();  
	        account.executeTransaction("deposit", 1000);
	        account.executeTransaction("withdraw", 500);
	        account.executeTransaction("withdraw", 700);  
	    }
	

	}


