package Assignment5;
//Creating a class
class Vehicle{
	String make;
	String model;
	int year;
	int maximumSpeed;
	//Constructor
	Vehicle(String make,String model,int year,int maximumSpeed)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.maximumSpeed=maximumSpeed;
	}
	void drive()
	{
		System.out.println("The vehicle are driven");
	}
}
class Car extends Vehicle{
	Car(String make,String model,int year,int maximumSpeed)
	{
        super(make,model,year,maximumSpeed);
	}
	void drive()
	{
        System.out.println( (make   + model+ " Car is driving" ));
	}
	
}
//method override
class Bike extends Vehicle{
	Bike(String make, String model, int year, int maximumSpeed)
	{
        super(make, model, year, maximumSpeed);
    }
	void drive()
	{
		System.out.println( (make +    model+ "Bikeis driving" ));
       
	}
	
}


public class Transport {

	public static void main(String[] args) {
		Car c = new Car("TATA", "INDICA", 1990, 200);
        Bike b = new Bike("BAJAJ", "FZ", 2016, 180);
        System.out.println("Car Make: " + c.make);
        System.out.println("Car Model: " + c.model);
        System.out.println("Car Year: " + c.year);
        System.out.println("Car Maximum Speed: " + c.maximumSpeed);
        System.out.println("Bike Make: " + b.make);
        System.out.println("Bike Model: " + b.model);
        System.out.println("Bike Year: " + b.year);
        System.out.println("Bike Maximum Speed: " + b.maximumSpeed);
        c.drive();
        b.drive();
	}

}
