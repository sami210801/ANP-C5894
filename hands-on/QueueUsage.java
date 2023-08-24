package collection;
/*Write a Java program that demonstrates the usage of a Queue (LinkedList):
/*Enqueue a series of elements.
/*Dequeue elements from the Queue.
/*Print the elements after each dequeue operation.*/
import java.util.*;
public class QueueUsage {

	public static void main(String[] args) {
		// Create a linked  list of strings
				Queue<Integer>q= new LinkedList<>();
				//Adding or Enqueue   elements into the queue.
		q.add(1001);
		q.add(1002);
		q.add(1003);
		q.add(1004);
		System.out.println("Elements are"+q);
		// Removing or Dequeue elements from the queue.
		q.remove(1003);
		System.out.println("Removed elementis:"+q);
		//Printing the elements in the queue.
		System.out.println("Elements are"+q);
		q.remove(1001);
		System.out.println("Removed elementis:"+q);
		//Printing the elements in the queue.
				System.out.println("Elements are"+q);
			}
	}


