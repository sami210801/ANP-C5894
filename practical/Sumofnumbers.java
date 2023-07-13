package oops;
import java.util.*;
public class Sumofnumbers {

	 public static void main(String[] args)
	 {
	 		 	//Scanner class object
	 	        Scanner d = new Scanner(System.in);
	 	        
	 	        //input from user
	 	        System.out.print("Enter the number of values to sum: ");
	 	        
	 	        //integer input
	 	        int count = d.nextInt();
	 	        int sum = 0;
	 	        for (int i = 1; i <= count; i++) 
	 	        {
	 	            System.out.print("Enter value #" + i + ": ");
	 	            int value = d.nextInt();
	 	            sum += value;
	 	        }

	 	        System.out.println("The sum of all " + count + " numbers is: " + sum);

	 	        d.close();
	 	    }
	 	}
