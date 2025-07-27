package Day7;
import java.util.Scanner;
public class FactorialWithExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter a non-negative integer: ");
            int number = scanner.nextInt();

            
            if (number < 0) {
                throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } 
        finally {
            
            System.out.println("Program has ended.");
            scanner.close();
        }
	}


		

	}


