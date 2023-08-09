package collection;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Queuesample {

	public static void main(String[] args) {
		Queue<String>q= new LinkedList<>();
q.add("Addition");
q.add("Subtract");
q.add("Divide");
q.add("Multiplication");
System.out.println("Elements are"+q);
q.remove("Subtract");
System.out.println("Elements are"+q);
System.out.println("Queue is empty?"+q.isEmpty());
System.out.println("Elements are"+q);
	}

}
