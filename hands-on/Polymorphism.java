package oops;

public class Polymorphism {
	// 2 types
	// 1.Method Overloading/Compiletime polymorphism
	//same method name with different parameters & return type.
			
		public int sub(int a,int b) 
		{
			return a+b;
		}
		public int sub(int a,int b,int c) 
		{
			return a+b+c;
		}
		public double sub(double a,double b) 
		{
			return a-b;
		}
	}
	class PolymorphismMain
	{
		public static void main(String[] args)
		{
			Polymorphism p=new Polymorphism();
			System.out.println("The sum is :" + p.sub(20,40));
			System.out.println("The sum is :" + p.sub(10,40,10));
			System.out.println("The sum is :" + p.sub(20.40,60.00));
		}
	}


	//2.Method Overriding/Runtime polymorphism 

	//inheritance concept
	
