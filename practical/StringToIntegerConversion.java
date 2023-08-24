package collection;
/* Write  a Java program that reads a string input from the user.
 Convert the string to an integer using the
 method.
 Handle the NumberFormatException that can occur if the input cannot be parsed as an integer.
 Display a message indicating that the input is not a valid integer.*/
import java.util.Scanner;

public class StringToIntegerConversion {

	public static void main(String[] args) {
		//Creating Scanner class object to take the input from user
		Scanner scanner = new Scanner(System.in);

		//Prompts user to enter string as integer
		System.out.println("Enter String as Integer");

		//String input for variable input
		String input = scanner.nextLine();

		//Try block contains the code to convert the string to integer
		try
		{
		//Integer input for variable number
		int number= Integer.parseInt(input);
		//Printing the message if the string is converted
		System.out.println("String converted Successfully to :" +number);
		}

		//Catch block to handle if the input cannot be parsed as an integer
		catch(NumberFormatException e)
		{
		System.out.println("Invalid integer");
		}

		//Closing the Scanner class object
		scanner.close();

	}

}
