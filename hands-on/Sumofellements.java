package collection;
import java.util.ArrayList;
import java.util.List;
public class Sumofellements {

	public static void main(String[] args) {
		
		
					List<Integer> num= new ArrayList<>();

					//Adding elements in list
					num.add(12);
					num.add(20);
					num.add(10);
					num.add(11);
					int sum =0;
					
					for (int i = 0; i < num.size(); i++)
						
					{
						sum+=num.get(i);
						
					}
					//print the value
					System.out.println("sum of all elements in the array"+sum);
			        
				}
			}
