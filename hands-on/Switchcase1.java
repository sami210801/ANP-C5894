package oops;
import java.util.*;
public class Switchcase1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a day(1-12):");
		int month=sc.nextInt();
		String monthname;
		
		switch(month)
		{
		case 1: 
			monthname="January";
			//break is used to jump out of the loop
			break;
			
			case 2:
				monthname="February";
				//break is used to jump out of the loop
				break;
				
				case 3:
					monthname="March";
					//break is used to jump out of the loop
					break;
					
					case 4: 
						monthname="april";
						//break is used to jump out of the loop
						break;
						
						case 5: 
							monthname="May";
							//break is used to jump out of the loop
							break;
							
							case 6: 
								monthname="June";
								//break is used to jump out of the loop
								break;
								case 7: 
									monthname="july";
									//break is used to jump out of the loop
									break;
									
								case 8: 
									monthname="August";
									//break is used to jump out of the loop
									break;
								case 9: 
									monthname="September";
									//break is used to jump out of the loop
									break;
								case 10: 
									monthname="October";
									//break is used to jump out of the loop
									break;
								case 11: 
									monthname="November";
									//break is used to jump out of the loop
									break;
								case 12: 
									monthname="December";
									//break is used to jump out of the loop
									break;
								
		default:
			monthname="Invalid month";
			//break is used to jump out of the loop
			break;	
		}
		System.out.println("The month is:"+ monthname);
									
								
		}		
			
		}


