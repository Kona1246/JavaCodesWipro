package JavaCodesDay4;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		   
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");

		        int number = scanner.nextInt();

		        if (number % 2 == 0) {
		            System.out.println(number + " is an even number.");
		        } else {
		            System.out.println(number + " is an odd number.");
		        }

		        scanner.close();
		    }
		


	}


