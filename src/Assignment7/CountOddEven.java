package Assignment7;

import java.util.Scanner;//Scanner importing

public class CountOddEven {

	public static void main(String[] args) {
		//Scanner Class
		Scanner sc=new Scanner(System.in);
		
		
		int count1=0;
		int count2=0;
		
		    //User Input 
			System.out.println("Enter the number range: ");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
			   if(n==-1)
			   {
				   break;
			   }
			   //Check the number of count of numbers are Even or Odd
			   if(i%2==0)
			   {
				   count1++;
				   
			   }
			   else
			   {
				   count2++;
			   }
		  
			}
		
		System.out.println("The Count of Even Number is: "+count1);
		System.out.println("The Count of Odd Number is: "+count2);
		sc.close();
	}

}
