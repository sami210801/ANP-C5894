package operator;
/* Write a Java program that takes an integer input from
the user and checks if it is even or odd using bitwise operators. 
Print "Even" if the number is even, and "Odd" if the number is odd.
*/
import java.util.Scanner;
public class Integer {

	public static void main(String[] args) {
	//creating object for scanner class	
Scanner sc = new Scanner(System.in);
//input the first integer
System.out.println("Enter the number");
int num =sc.nextInt();
// n^1 is n+1, then even, else odd
if ((num ^ 1) == (num + 1))
	System.out.println("it is even number");
else
	System.out.println("it is odd number");
	}

}
