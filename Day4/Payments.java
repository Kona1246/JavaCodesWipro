package JavaCodesDay4;

public abstract class Payments {

	
		// TODO Auto-generated method stub
		double amount ;
		
		Payments(double amount)
		{
			this.amount = amount ;
		}
		
		abstract void makePayment() ;
		
		void showSuccessMessage()
		{
			System.out.println("Payment successfull "+amount);
		}
		
	}
	class CreditCardPayment extends Payments
	{
		CreditCardPayment(double amount)
		{
			super(amount) ;
			
		}
		
		void makePayment()
		{
			System.out.println("Credit Card payment is Done...");
		}
	}
	class UpiPayment extends Payments
	{
		 UpiPayment(double amount)
		 {
			super(amount) ;
		}
		
		 void makePayment()
		 {
			 System.out.println("Upi payment is Done...");
		 }
	}
	


