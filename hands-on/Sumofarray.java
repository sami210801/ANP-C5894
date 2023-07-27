package array;
/*Write a program that takes the size of the array as input from the user.
 *  Then, prompt the user to enter elements of the array. 
 *  Calculate and display the sum of all elements in the array.
 */
import java.util.Scanner;
public class Sumofarray {

	public static void main(String[] args) {
		//scanner class object
        Scanner sc = new Scanner(System.in);
      //input the size 
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
      //input the integer
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++)
        {
            numbers[i] = sc.nextInt();
        }
// Display the elements entered by the user
System.out.println("Elements in the array:");
int sum=0;
for (int i = 0; i < size; i++)
	
{
	sum+=numbers[i];
	 System.out.print(numbers[i] + " ");
}
//print the value
{
System.out.println("sum of all elements in the array"+sum);
sc.close();
}
	}

}
