package oops;
/*Write a Java program that asks the user to enter a series
 of numbers (positive or negative) and calculates their sum.
 The program should stop asking for input when the user enters 0.
 Use a do-while loop to continuously ask for numbers and keep adding them to the sum.
 */
import java.util.*;
public class Seriesofnumber {

	public static void main(String[] args) {
		//Scanner class object
	        Scanner sc = new Scanner(System.in); 
	        int num;
	      //integer input
	        	int sum = 0;
 	        do
 	        {
 	        	//input from user
 	        	System.out.print("Enter the series ofnumber of values to sum(Positive or negative: ");
 	        	  num = sc.nextInt();
 	        	  sum += num;
 	        }
 	     //Test expression
     while(num != 0);
 	     
 	       System.out.println("enter the number " +  num+ " is " + sum);
 	      sc.close();
 	        }
	}

