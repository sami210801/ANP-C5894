package operator;
/*.Write a Java program that takes two integer inputs from 
 * the user and swaps their values using bitwise operators.
 *  After swapping, print the updated values of the two integers.
 */
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		//creating object for scanner class	
		 Scanner scanner = new Scanner(System.in);

		  // Input first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Input second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
     // Swapping the values
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Value of num1 is " + num1
                           + " and Value of num2 is " + num2);
    }
 
	}





