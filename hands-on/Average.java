package collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Average {

	public static void main(String[] args) {
		//create list of integers
				List<Integer> num= new ArrayList<>();

				//Adding elements in list
				num.add(12);
				num.add(20);
				num.add(10);
				num.add(11);
				int sum=0;

				for (int i = 0; i < num.size(); i++)
					
				{
					sum+=num.get(i);
					
				}
				int avg=sum/num.size();
				System.out.println("average of all elements in the linked list of integers"+avg);
				
	}

}
