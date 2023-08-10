package collection;
/*Question 5: Stack Implementation
Implement a stack using either an ArrayList or a LinkedList. Write a program that performs the following operations:
a) Push elements onto the stack.
b) Pop elements from the stack.
c) Check whether the stack is empty.
d) Display the elements in the stack.
*/
import java.util.Stack;
public class StackImplementation {

	public static void main(String[] args) {
		// Create a Stack to store strings
		Stack<String>s=new Stack<String>();
		//Pushing the elements onto the stack
		s.push("Monitor");
		s.push("Key board");
		s.push("Mouse");
		s.push("CPU");
		System.out.println("Parts of computer"+s);
		// Popping elements from the stack
		System.out.println("Pop parts"+s.pop());
		System.out.println("Parts of computer"+s);
		// Check if the stack is empty
		System.out.println("parts of computer is empty?"+s.empty());
		System.out.println("Parts of computer"+s);

	}

}
