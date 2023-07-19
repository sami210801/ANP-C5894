package operator;
import java.util.*;
public class Checknumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three digit number");
	int number= sc.nextInt();

    // Extracting the digits
    int firstDigit = number / 100;
    int thirdDigit = number % 10;

    // Checking if it's a palindrome
    if (firstDigit == thirdDigit) {
        System.out.println("The number is a palindrome.");
    } else {
        System.out.println("The number is not a palindrome.");
    }
	}

}
