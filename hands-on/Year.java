package oops;
import java.util.*;
public class Year {
 public static void main(String[]args)
 {
	 Scanner n= new Scanner(System.in);
		System.out.println("Enter a value:");
		int c=n.nextInt();
		if(c % 4==0)
		{
			System.out.println("it is a leap year");
		}
		else if (c % 100==0)
		{
			System.out.println("it is a leap year");
		}
			else if (c % 400==0)
			{
				System.out.println("it is aleap year");
			
				
			}
			else System.out.println("it is not aleap year");
	}
 }
