package programs;

interface shape{
	void calculateArea();
	void calculatePerimeter();
}

class Circle implements shape{
	
	private double radius;
	Circle(double radius)
	{
		this.radius =radius; 
	}
	public void calculateArea()
	{
		System.out.println("Area of circle: "+ 2*3.14*radius*radius);
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of circle: "+ 2*3.14*radius);
	}
}
class Rectangle implements shape{
	
   private double length;
   private double breath;
   
	Rectangle(double length, double breath){
	     	this.length=length;
	     	this.breath=breath;
     }
	public void calculateArea()
	{
		System.out.println("Area of circle: "+ breath*length);
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of circle: "+ 2*(length+breath));
	}
}
class Triangle implements shape{
	
	private double base, height,length;
	
	public Triangle(double base, double height, double length){
		this.base=base;
		this.height=height;
		this.length=length;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of triangle :"+ 1/2*base+height);
	}
	@Override
	public void calculatePerimeter() {
		
		System.out.println("Parimeter of triangle: "+ base+height+length);
	}
}

public class Diagram_Shape {
	 public static void main(String args[])
	 {
        Circle c = new Circle(2.0);
        Rectangle r = new Rectangle(3.0,4.0);
        Triangle t = new Triangle(1.0,5.0,6.0);
        
        c.calculateArea();
        c.calculatePerimeter();
        r.calculateArea();
        r.calculatePerimeter();
        t.calculateArea();
        t.calculatePerimeter();
	 }
}
