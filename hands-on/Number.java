package oops;
import java.util.*;
public class Number {
	public static void main(String[] args)
	{
		//Scanner class to take input from the user
		 Scanner n= new Scanner(System.in);
		System.out.println("Enter a value:");
		
		//integer input from the user 
		int b=n.nextInt();
		
		//condition
		if(b>=0)
		{
			System.out.println("number is positive");

		}
		else 
			System.out.println("Number is negative");
		
		}
}

