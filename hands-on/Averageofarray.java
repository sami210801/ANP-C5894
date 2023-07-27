package array;
/*Write a program that takes the size of the array as input from the user. 
 * Then, prompt the user to enter elements of the array. 
 * Calculate and display the average of all elements in the array.
 */
import java.util.Scanner;
public class Averageofarray {

	public static void main(String[] args) {
		 //scanner class object
Scanner sc=new Scanner(System.in);
//input the size 
System.out.println("Enter the size of integer");
int size=sc.nextInt();
int[] numbers = new int[size];
//input the integer
System.out.println("Enter " + size + " integers:");

for (int i = 0; i < size; i++)
{
    numbers[i] = sc.nextInt();
}
//Display the elements entered by the user
System.out.println("Elements in the array:");
int sum=0;
for (int i = 0; i < size; i++)

{
sum+=numbers[i];
}
int avg=sum/size;
//print the  value
System.out.println("average of all elements in the array"+avg);
sc.close();

	}

}
