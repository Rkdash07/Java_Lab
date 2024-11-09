package Assignment7;

import java.util.Scanner;

public class CheckArmstrong {
	 public void printArmstrongNumber(int start, int end) {
	        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
	        
	        for (int n=start;n<=end;n++) {
	            int Cube = 0;
	            int temp = n;
	            
	            // sum of cube of each number is calculated
	            while (temp > 0) {
	                int num = temp % 10;
	                
	                // Calculate cube 
	                int c = num * num * num;
	                
	                Cube += c;
	                temp /= 10;
	            }
	            //Check the number is armstrong or not
	            if (Cube == n) {
	                System.out.println(n);
	            }
	        }
	    }
	public static void main(String[] args) {
		
		CheckArmstrong ca=new CheckArmstrong();
		
        Scanner scanner = new Scanner(System.in);
        //Starting and Ending Number
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        
        //Method Call
        ca.printArmstrongNumber(start, end);
        
        scanner.close();    
	}
}
