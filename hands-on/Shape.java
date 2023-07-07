package oops;

 abstract class Shape
 {
public abstract void calculateArea ();
public abstract void calculatePerimeter();

}
    class Rectangle extends Shape 
{
	public void calculatePerimeter()
	{
		System.out.println("perimeter of rectangle:p=2+(l+w)");
	}
	public void calculateArea()
	{
		System.out.println("area of rectangle:a=(wl)");
	}
}
    class Circle extends Shape 
{
	 public void calculatePerimeter()
	{
		System.out.println("perimeter of circle:C=2πr");
	}
	 public void calculateArea()
		{
			System.out.println("area of circle:A=πr2");
		}
	}
    class Triangle extends Shape 
{
	 public void calculatePerimeter()
	{
		System.out.println("perimeter of triangle:p=a+b+c");
	}
	 public void calculateArea()
			{
				System.out.println("area of triangle:A=hbb\r\n");
			}
}
class ShapeMain
{
	public static void main(String [] args)
	{
	Rectangle r=new Rectangle();
	r.calculateArea();
	r.calculatePerimeter();
	
	Circle c=new Circle();
	c.calculateArea();
	c.calculatePerimeter();
	
	Triangle t=new Triangle();
	t.calculateArea();
	t.calculatePerimeter();
	}
}
			