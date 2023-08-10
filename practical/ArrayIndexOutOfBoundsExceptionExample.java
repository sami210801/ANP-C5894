package collection;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int size=sc.nextInt();
		int[]array=new int [size];
		System.out.println("Enter the elements for the Array");
		for(int i=0;i<size;i++)
		{
			System.out.println("Element"+i+":");
			array[i]=sc.nextInt();
		}
		System.out.println("Enter an index to retrive an element");
		int index=sc.nextInt();
		try
		{
			int element=array [index];
					System.out.println("Element at index"+index+":");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
        sc.close();
	}

}

