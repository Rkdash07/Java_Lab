package Assignment8;
//Parent Class
class Animal{
	
	public void makeSound()
	{
		System.out.println("The animal makes sound");
	}
}
//Child Class as Dog
class Dog extends Animal{
	//Overriding method
	public void makeSound()
	{
		System.out.println("The Dog barks");
	}
}
//Child Class as Cat
class Cat extends Animal{
	//Overriding method
	public void makeSound()
	{
		System.out.println("The Cat meows");
	}
}
public class AnimalSound {

	public static void main(String[] args) {
		//Referenecs are created
		Animal A = new Animal();
		Cat C = new Cat();
		Dog D = new Dog();
		
		//method Called
		//Animal class
		System.out.print("The Animal: ");
		A.makeSound();
		//Cat Class
		System.out.print("\nThe Cat: ");
	    C.makeSound();
	    //Dog Class
		System.out.print("\nThe Dog: ");
	    D.makeSound();
	}

}
