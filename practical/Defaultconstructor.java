package operator;

public class Defaultconstructor {
	private String name;
	private int age;
	public static void main(String[] args) {
		
	
	}
	public Defaultconstructor() {
		name="sam";
		age=22;
		
	}
	public Defaultconstructor(String name)
	{
	
		this.name = name;
		  age = 30; // Default age
	}
	public Defaultconstructor(String name, int age) 
	{
		
		this.name = name;
		this.age = age;
		
	}
	public String getName() {
		return name;
		}
	public int getAge() {
		return age;
	}
	
	
}
class defaultconstructorMain
{
	public static void main(String[]args)
	{
		Defaultconstructor  person1 = new Defaultconstructor(); // Default constructor
		Defaultconstructor person2 = new Defaultconstructor("Alice",24); // Constructor with name parameter
		Defaultconstructor person3 = new Defaultconstructor("Bob", 25); // Constructor with name and age parameters
	    // Getting information using getter methods
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
        System.out.println(person3.getName() + " is " + person3.getAge() + " years old.");
    }
}
	
