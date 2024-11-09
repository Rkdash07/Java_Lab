package Assignment8;
//Abstract Class
abstract  class Shape{
	//Abstract method
	 abstract void calculateArea();
	
} 
    //Subclass Circle
	 class Circle extends Shape{
		 float r = 4;
		 void calculateArea()
		 {
			 float CircleArea = 3.14f * r * r;
			 System.out.println("Area of the Circle is: "+ CircleArea);
		 }
	 }
	 //Subclass Rectangle
	 class Rectangle extends Shape{
		 float l = 40;
		 float b = 50;
		 void calculateArea()
		 {
			 float RectangleArea = l * b;
			 System.out.println("Area of the Circle is: "+ RectangleArea);
		 }
	 }

public class AreaCalculation {

	public static void main(String[] args) {
		//Object references
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		
		//method Calling
		c.calculateArea();
		r.calculateArea();
		
		

	}

}
