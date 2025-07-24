package JavaCodesDay5;
import java.util.Scanner;
public class RealEstateSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			       Scanner sc = new Scanner(System.in);
			       System.out.print("Enter your category (Apartment/House): ");
			       String category = sc.next();
			       System.out.print("Enter base rent amount: ");
			       double rent = sc.nextDouble();
			       RentCalculator rc;
			       if (category.equalsIgnoreCase("Apartment")) {
			           rc = new Apartment();
			       } else if (category.equalsIgnoreCase("House")) {
			           rc = new House();
			       } else {
			           System.out.println("Invalid category entered.");
			           sc.close();
			           return;
			       }
			       rc.tax(rent);
			       sc.close();
			   }
			


		


	}


