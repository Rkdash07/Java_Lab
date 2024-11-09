package Assignment3;

import java.util.Scanner;
//Main Class
class Car {
	String make;
	String model;
    short year;
    int price;
    //Constructor
    Car(String make,String model,short year,int price)
    {
    	this.make=make;
    	this.model=model;
    	this.year=year;
    	this.price=price;
    }
    //Method display
    public void display() {
        System.out.println("Car Make is " + make);
        System.out.println("Car Model is " + model);
        System.out.println("Car Year of manufacture is " + year);
        System.out.println("Car Price is " + price);
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the make ");
        String make = scanner.nextLine();
        
        System.out.println("Enter the model ");
        String model = scanner.nextLine();
        
        System.out.println("Enter the year of manufacture ");
        short year = scanner.nextShort();
        
        System.out.println("Enter the car price ");
        int price = scanner.nextInt();
        //Object References
		Car c=new Car(make,model,year,price);
		c.display();
	}

}
