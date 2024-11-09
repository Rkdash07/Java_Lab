package Assignment5;
//created class
class Shape{
	
	void getArea()
	{
		System.out.println("The Area is printed");
	}
}
class Circle extends Shape{
	int radius;
	//constructor
	Circle(int radius)
	{
        this.radius=radius;
	}
	//method override
	void getArea()
	{
		System.out.println("The Area of a Circle is :"+(2*3.14*radius));
	}
	
}

class Square extends Shape{
	int length;
	//constructor
	Square(int length)
	{
        this.length=length;
	}
	//method override
	void getArea()
	{
		System.out.println("The Area of a Square is :"+(length*length));
	}
	
}
class Rectangle extends Shape{
	int width;
	int height;
	//constructor
	Rectangle(int width,int height)
	{
        this.width=width;
        this.height=height;
	}
	//method override
	void getArea()
	{
		System.out.println("The Area of a Rectangle is :"+(width*height));
	}
	
}
public class Size {

	public static void main(String[] args) {
		//Object created
		Shape c = new Circle(25);
		Shape s = new Square(20);
		Shape r = new Rectangle(20,25);
		//method called
        c.getArea();
        s.getArea();
        r.getArea();
	}

}
