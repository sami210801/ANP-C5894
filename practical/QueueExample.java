package collection;
import java.util.*;
import java.util.LinkedList;
public class QueueExample {

	public static void main(String[] args) {
		Queue <Integer> q=new LinkedList<>();
		for(int i=0;i<5;i++)
		{
			q.add(i);
		}
		System.out.println("Elemet of queue"+q);
		int r=q.remove();
		System.out.println("Removed elementis:"+r);
		System.out.println("Elemet of queue:"+q);
		int h=q.peek();
		System.out.println("head of queue:"+h);
		int s=q.size();
		System.out.println("size of queue:"+s);
		
		
	}

}