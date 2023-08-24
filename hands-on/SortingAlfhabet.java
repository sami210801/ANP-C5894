package collection;
/*Write a Java program that sorts a list of strings in alphabetical
 *order using the Collections framework.
 */
import java.util.*;
import java.util.List;
import java.util.Collections;
public class SortingAlfhabet {

	public static void main(String[] args) {
		List<String>q= new LinkedList<>();
		//Adding or Enlisting   elements into the list.
		q.add("Amitab Bachan");
		q.add("Sharuk Khan");
		q.add("Salman Khan");
		q.add("Amir Khan");
		//sorting the list in alphabet order
		Collections.sort(q);
		//printing the statement in alphabet order
		System.out.println("Elements are"+q);
	}

}
