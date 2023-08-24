package collection;
/*Question 6: Queue Operations
Design a program that demonstrates the use of a Queue:
a) Enqueue elements into the queue.
b) Dequeue elements from the queue.
c) Check whether the queue is empty.
d) Print the elements in the queue.
*/
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Queuesample {

	public static void main(String[] args) {
		// Create a linked  list of strings
		Queue<String>q= new LinkedList<>();
		//Adding or Enqueue   elements into the queue.
q.add("Addition");
q.add("Subtract");
q.add("Divide");
q.add("Multiplication");
System.out.println("Elements are"+q);
// Removing or Dequeue elements from the queue.
q.remove("Subtract");
System.out.println("Elements are"+q);
//Checking whether the queue is empty.
System.out.println("Queue is empty?"+q.isEmpty());
//Printing the elements in the queue.
System.out.println("Elements are"+q);
	}

}
