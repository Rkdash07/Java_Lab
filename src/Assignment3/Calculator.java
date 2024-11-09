package Assignment3;

import java.util.Scanner;//importing Scanner 
//Class Calculator
public class Calculator {
	int c;
	//method with different types
	static int add(int x,int y){
		return x+y;
	}
    static int add(int x,int y,int z)
    {
    	
    	return x+y+z;
    }
    double d;
    static double add(double x,double y)
    {
       	return x+y;
    }
	public static void main(String[] args) {
		//Object Creation
		Calculator c=new Calculator();
		Scanner scanner=new Scanner(System.in);
		//for two Parameter values
		System.out.println("Enter 2 integer value number:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int res1=Calculator.add(a,b);
        System.out.println(res1);
        //for three Parameter values
        System.out.println("Enter 3 integer value number:");
        int d=scanner.nextInt();
        int e=scanner.nextInt();
        int f=scanner.nextInt();
        int res2 = Calculator.add(d,e,f);
        System.out.println(res2);
        //for four Parameter values
        System.out.println("Enter 2 double value number:");
        double x=scanner.nextDouble();
        double y=scanner.nextDouble();
        double res3=Calculator.add(x,y);
        System.out.println(res3);
	}

}
