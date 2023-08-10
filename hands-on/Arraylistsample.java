package collection;
/*Write a Java program that demonstrates the following operations using an ArrayList:
a) Adding elements to the list.
b) Removing an element from the list.
c) Updating an element in the list.
d) Displaying the contents of the list.
*/
import java.util.ArrayList;

public class Arraylistsample {

	public static void main(String[] args) {
		// Create a Array list of strings
		ArrayList <String> a=new ArrayList<>();
		  // Adding elements to Array list
		a.add("tomatto");
		a.add("onion");
		a.add("potato");
		a.add("lady finger");
		System.out.println("Elements in the queue:"+a);
		//Removing an element from the list.
		a.remove(3);
		System.out.println("Elements in the queue:"+a);
		// Updating an element in the list.
		a.set(1, "brinjal");
		System.out.println("updated Elements in the queue:"+a);
		//Displaying the contents of the list.
		System.out.println("Elements in the queue:"+a);
	}

}
