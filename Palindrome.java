package JavaCodes;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s + (s.equals(rev) ? " is a palindrome." : " is not."));
    }



	}


