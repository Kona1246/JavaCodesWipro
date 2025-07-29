package Course2_Assignment;
import java.util.Random;
public class RandomProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long random10DigitNumber = generateTenDigitRandomNumber();

	        System.out.println("Random 10-Digit Number: " + random10DigitNumber);
	    }

	    public static long generateTenDigitRandomNumber() {
	        Random random = new Random();

	        long min = 1000000000L; 
	        long max = 9999999999L;   

	        
	        long random10DigitNumber = min + (long)(random.nextDouble() * (max - min + 1));

	        return random10DigitNumber;
	    }
	

	}


