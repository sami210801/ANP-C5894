package oops;
import java.util.*;
public class Multiplicationtable {

	public static void main(String[]args)
	{
		Scanner p = new Scanner(System.in);
		System.out.println("enter a number");
		
		int r = p.nextInt();
		
		for (int i=1;i<=10;i++)
			
		
		{
			int result= r*i;
			System.out.println(r  + "*"+i+" = " +result );
					
		}
		p.close();
	}
}
