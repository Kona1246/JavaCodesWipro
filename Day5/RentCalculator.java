package JavaCodesDay5;

public abstract class RentCalculator {
	abstract void tax(double rent);
	}
class Apartment extends RentCalculator {
	   @Override
	   void tax(double r1) {
	       double t = 10 * r1 / 100;
	       double r2 = t + r1;
	       System.out.println("Tax for Apartment (10% of " + r1 + "): " + t);
	       System.out.println("Final Apartment Rent: " + r2);
	   }
	}
	class House extends RentCalculator {
	   @Override
	   void tax(double r1) {
	       double t = 20 * r1 / 100;
	       double r2 = t + r1;
	       System.out.println("Tax for House (20% of " + r1 + "): " + t);
	       System.out.println("Final House Rent: " + r2);
	   }
	}
	

