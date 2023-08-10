package collection;
/*.Write a program that attempts to divide two numbers.
 *  Whether the division is successful or not, make sure to display a "Division completed" message
 * Ensure that the division operation is performed in a try block and
 *  the "Division completed" message is displayed in a finally block.
 */
import java.util.Scanner;
public class DivideNumberExceptionalHandling {

	public static void main(String[] args) {
	
Scanner sc= new Scanner(System.in);
System.out.println("Enter the two numbers to divide ");

System.out.println("Enter the Firstnumber ");
int Firstnumber= sc.nextInt();

System.out.println("Enter the Secondnumber");
int Secondnumber= sc.nextInt();
try 
{
	 int result= Firstnumber/Secondnumber;
	 System.out.println("Result"+result);
}
catch (ArithmeticException e)
{
	System.out.println("An exception occured:"+e.getMessage());
}
finally
{
	System.out.println("Division completed");
}

sc.close();
	}

}
