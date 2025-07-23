package JavaCodesDay4;

public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments py = new CreditCardPayment(45000) ;
		py.makePayment();
		System.out.println("Credit Card Payment Process is Completed ");
		
		Payments py2 = new UpiPayment(30000) ;
		py2.makePayment();
		System.out.println("Upi Payment Process is Completed ");
	}



	}


