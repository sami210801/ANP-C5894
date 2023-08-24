package collection;
import java.util.Scanner;
public class NullPointerExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a String(or'null'to trigger the exception):");
		String input =sc.nextLine();
		try {
			int length=input.length();
			System.out.println("length of the input string:"+length);
		}
		catch(NullPointerException e)
		
		{
			System.out.println("an exception occured:"+e.getMessage());
		}
	}

}
