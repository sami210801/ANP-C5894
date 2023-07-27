package operator;

import java.util.Scanner;

/*Write a Java program that takes an integer input from the user and checks 
 * if it is a power of 2 using bitwise operators.
 * Print "Yes" if it is a power of 2, and "No" otherwise
 */
public class Checkinteger {

	public static void main(String[] args) {
		//creating object for scanner class	
		 Scanner scanner = new Scanner(System.in);
		//input the first integer
		 System.out.println("Enter the number");
		 int num =scanner.nextInt();
		 // n^1 is n+1, then even, else odd
		 if ((num ^ 1) == (num + 1))
		 	System.out.println("yes");
		 else
		 	System.out.println("no");
	}

}