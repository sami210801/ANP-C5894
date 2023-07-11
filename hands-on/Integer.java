package oops;
import java.util.*;
public class Integer {
	 public static void main(String[]args)
	 {
		 Scanner n= new Scanner(System.in);
			System.out.println("Enter a value:");
			int c=n.nextInt();
			if(c % 2==0)
			{
				System.out.println("divisible by 2");
			}
			else if (c % 3==0)
			{
				System.out.println("divisible by 2");
			}
				else if (c % 2==0 & 3==0)
				{
					System.out.println("divisible by 2");
				
					
				}
				else 
				{
					System.out.println("not divisible by 2");
				}
		}
	 }



