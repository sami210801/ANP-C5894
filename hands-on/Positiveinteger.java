package oops;
import java.util.*;
public class Positiveinteger {
public static void main(String[]args)
{

	int fact=1;
	int a=1;
	Scanner p = new Scanner(System.in);
	System.out.println("Enter a positive integer:");
	
	int i =p.nextInt();
while (i<=0) {
	fact*=a;
	a++;
}

	System.out.println("The factorial of " + a  + " is: " + fact);

   
}
	
}
