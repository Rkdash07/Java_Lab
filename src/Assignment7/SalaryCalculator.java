package Assignment7;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		//Scanner Class
		Scanner scan = new Scanner(System.in);
		//Number of Employee
		System.out.println("Enter the number of employee salary to be Calculated: ");
		int t=scan.nextInt();
		
		//Looping the each Employee Salary
		for(int i=1;i<=t;i++)
		{
			System.out.println("Enter the "+ i +"th Employee  basic Salary: ");
			double basicSal = scan.nextDouble();
			double hra,da;
		     //Check the Gross Salary
			if (basicSal > 15000)
			{
                hra = basicSal * 0.20; //  basic salary of 20% 
                da = basicSal * 0.60;  // basic salary of 60% 
            } 
			else 
			{
                 hra = 3000;               
                 da = basicSal * 0.70;  //  basic salary of 70%
            }
			
			 double grossSal = basicSal + hra + da;
			 System.out.println("The Gross Salary of "+i+"th Employee is: "+ grossSal);
		}
		
		scan.close();

	}

}
