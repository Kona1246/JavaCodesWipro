package JavaCodesDay4;

public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentSystems ep = new DebitCardPayment(34000) ;
		ep.makePayment();
		
		
		System.out.println();
		
		PaymentSystems ep2 = new NetBankingPayment(55000) ;
		ep2.makePayment();		
		
		
	}



	}


