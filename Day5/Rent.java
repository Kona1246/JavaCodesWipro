package JavaCodesDay5;

public class Rent {
	double Rent;
	int expenses;
	double electricity;
	public void rent_money(int Rent,int expenses) {
		this.Rent=Rent;
		this.expenses=expenses;
		System.out.println("rent is"+Rent);
		System.out.println("expenses are"+expenses);
		System.out.println(Rent+expenses);
	}
	public void rent_money(double Rent,double electricity) {
		this.Rent=Rent;
		this.electricity=electricity;
		System.out.println("rent is"+Rent);
		System.out.println("expenses are"+electricity);
		System.out.println(Rent+electricity);
}
}




	


