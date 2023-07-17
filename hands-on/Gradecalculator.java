package oops;
import java.util.*;
public class Gradecalculator {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	   System.out.println("Welcome to the final year Result!");
     System.out.print("Enter the Marks: ");
     int marks=sc.nextInt();
     String grade = null;
     if(marks< 0 || marks >=100)
     {
    	 System.out.println("enter the marks between 0 to 100");
	}
	else
	{
		System.out.println("Handle input validation to ensure the grade is within the valid range");
	}	
    	 
     switch(marks/10)
     {
     case 10:
     case 9:
    	 grade = "A";
    	 break;
     case 8:
    	 grade = "B";
    	 break;
     case 7:
    	 grade = "C";
    	 break;
     case 6:
    	 grade = "D";
    	 break;
     case 5:
    	 grade = "E";
    	 break;
    	 default:
    		
    	 
     }
     System.out.println("The grade is:"+grade);
		
	}
}