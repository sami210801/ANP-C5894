package collection;

import java.util.*;
import java.util.HashSet;
public class HashSetsample {

	public static void main(String[] args) {
		//Create a Hash set object as a string
		Set<String> s=new HashSet <String>();
		//Adding elements to the set.
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		System.out.println("Elements are:"+s);
		//Checking whether a specific element exists in the set.
		String c="D";
		System.out.println("Elements contains: "+ c  + s.contains(c));

	}

}
