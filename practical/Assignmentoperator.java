package operator;
import java.util.Scanner;
public class Assignmentoperator {

	
	    public static void main(String[] args) 
	    {
	    	//input from the user
	        Scanner sc = new Scanner(System.in);

	        //input for the initial value
	        System.out.print("Enter the initial value: ");
	        int value = sc.nextInt();

	        //input for the increment value
	        System.out.print("Enter the increment value: ");
	        int increment = sc.nextInt();

	        //input for the increment value
	        System.out.print("Enter the decrement value: ");
	        int decrement = sc.nextInt();

	        // Equivalent to: value = value + increment;
	        value += increment; //3+2=5
	        System.out.println("After increment: " + value); 

	        // Equivalent to: value = value - decrement;
	        value -= decrement; //5-1=4
	        System.out.println("After decrement: " + value);
	        sc.close();
	    }
	}