package oops;
import java.util.*;
public class Integers {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value:");
		
		int d=s.nextInt();
	
		if(d % 5==0 && d%11 == 0)
		{
			System.out.println(" divisible by both 5&11 ");
		}
		else 
			{
				System.out.println(" not divisible ");
	}
	}
}
