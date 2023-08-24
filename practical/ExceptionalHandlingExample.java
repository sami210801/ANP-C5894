package collection;
import java.util.Scanner;
public class ExceptionalHandlingExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the neumerator");
int neumerator= sc.nextInt();

System.out.println("Enter the denomenator");
int denomenator= sc.nextInt();
 try 
 {
	 int result= neumerator/denomenator;
	 System.out.println("Result"+result);
 }
catch (ArithmeticException e)
{
	System.out.println("An exception occured:"+e.getMessage());
}
	
sc.close();
	}

}
