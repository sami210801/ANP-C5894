package collection;
/*Question 2: HashSet Operations
Create a program that show cases the usage of a HashSet:
a) Add elements to the set.
b) Check whether a specific element exists in the set.
c) Remove an element from the set.
d) Print the elements of the set. 
 */
import java.util.*;
public class HashSetexample {

	public static void main(String[] args) {
		//Create a Hash set object as a string
		Set<String> s=new HashSet <String>();
		//Adding elements to the set.
		s.add("Apple");
		s.add("Bat");
		s.add("Cup");
		s.add("Duck");
		System.out.println("Elements are:"+s);
		//Checking whether a specific element exists in the set.
		String cup="Duck";
		// Removing an element from the set.
		s.remove("Apple");
		System.out.println("Elements are:"+s);
		// Printing the elements of the set. 
		System.out.println("Elements contains: "+ cup  + s.contains(cup));

	}

}
