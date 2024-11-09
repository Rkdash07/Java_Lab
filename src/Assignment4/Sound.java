package Assignment4;
//super class
   class Animal{
	   public void  makeSound()
	   {
		   System.out.println( "The animal makes a sound");	  
		}
   }
    //overriding the class with super class
   class Dog extends Animal{
	   public void  makeSound()
	   {
		   System.out.println( "The Dog barks");	  
		}
   }
   class Cat extends Animal{
	   public void  makeSound()
	   {
		   System.out.println( "The Cat meows");	  
		}
   }
public class Sound {

	public static void main(String[] args) {
		//Object Created
		Animal a=new Animal();
		Dog d=new Dog();
		Cat c=new Cat();
		
		
		System.out.println("Animal sound:");
        a.makeSound();

        System.out.println("\nDog sound:");
        d.makeSound();

        System.out.println("\nCat sound:");
        c.makeSound();
	}

}
