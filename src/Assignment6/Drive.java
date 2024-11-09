package Assignment6;
//base class
class Vehicle{
	void start()
	{
		System.out.println("Vehicle Started");
	}
}
//Sub class as Car
class Car extends Vehicle{
	//Overrriden method
	void start()
	{
		System.out.println("Car Started");
	}
}
//Sub class as Motorcycle
class Motorcycle extends Vehicle{
	//Overriden method
	void start()
	{
		System.out.println("Motorcycle Started");
	}
}

class Garage{
	void serviceVehicle(Vehicle vehicle) {
        vehicle.start();//Calling the base class method
        System.out.println("Vehicle serviced");
    }
}

public class Drive {
	
	public static void main(String[] args) {
		//Object references
        Car c=new Car();
        Motorcycle mc = new Motorcycle();
        Garage g=new Garage();
        //Method called
        g.serviceVehicle(c);
        g.serviceVehicle(mc); 
	}

}
