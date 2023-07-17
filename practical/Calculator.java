package oops;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		   System.out.println("Welcome to the Calculator App!");
	        System.out.println("-------------------------------");
	        System.out.print("Enter the first number: ");
	        
		System.out.println("");
		double num1 =sc.nextDouble ();
		 System.out.println("Enter the second number:");
		
		double num2 =sc.nextDouble ();
		 System.out.println("Available operation");
		 System.out.println("1.Addition");
		 System.out.println("2.Subtraction");
		 System.out.println("3.Multiplication");
		 System.out.println("4.Division");
		 System.out.println("Enter the operation number:");
		 int operation=sc.nextInt();
		 double result;
		 switch (operation)
		 {
		 case 1:
             result = num1 + num2;
             System.out.println("The result of addition is: " + result);
             break;
		 case 2:
             result = num1 - num2;
             System.out.println("The result of subtraction is: " + result);
             break;
		 case 3:
             result = num1 * num2;
             System.out.println("The result of multiplication is: " + result);
             break;
		 case 4:
			 if (num2!=0)
			 {
             result = num1 / num2;
             System.out.println("The result of divission is: " + result);
		 }
             else
             {
             System.out.println("error division by zero is not allowed");
             }
          break;
          
          default:
        	  System.out.println("Error invalid operation number");
        	  break;
		 }
		 sc.close();
		 }
          
	}


