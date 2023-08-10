package collection;
/*Write a program that takes an integer input from the user and 
 * throws this custom exception if the input is negative.
 *  Catch the exception and display an error message accordingly.
 */
import java.util.Scanner;
public class IntegerExceptionHandling {

	public static void main(String[] args) {
		//creating object for scanner class	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer input");
		int num =sc.nextInt();
		
		try
		{
			if (num <= 0)
			System.out.println(" error message");
		}
catch (Exception  e)
{
	System.out.println("Exception :"+e.getMessage());
}
		sc.close();
	}

}
