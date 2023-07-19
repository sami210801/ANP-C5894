package operator;
import java.util.Scanner;
public class Checkage {

	public static void main(String[] args)
	{
		
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the age");
  int age=sc.nextInt();
  
if (age>=18 && age<=30)
{
	System.out.println(" eligible for job");
	
}
else 
{
	System.out.println("not eligible for job");
}
 
	}

}
