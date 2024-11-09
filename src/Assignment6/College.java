package Assignment6;
class Student{
	   String name;
	   int age;
	   String department;
    //Constructor with no parameter
      Student(){
    	  name = "Unknown";
    	  age = 20;
    	  this.department = "Unassigned"; 
      }
    //Constructor with two parameter
      Student(String name,int age){
    	  this.name = name;
    	  this.age = age;
    	  department = "IT";
      }
    //Constructor with three parameter
      Student(String name,int age,String department){
    	  this.name = name;
    	  this.age = age;
    	  this.department = department; 
      }
      //Method to display
      void display() {
          System.out.println("Name: " + name);
          System.out.println("Age: " + age);
          System.out.println("Department: " + department);
          System.out.println();
      }
}
      
public class College {
//Main class
	public static void main(String[] args) {
		//creating Three Object as s1,s2,s3 with same constructor name
		Student S1 = new Student();
		Student S2 = new Student("Rakesh",23);
		Student S3 = new Student("Rubi",25,"Bussiness");
		
	    //display the method
        S1.display();
        S2.display();
        S3.display();
        
	}

}
