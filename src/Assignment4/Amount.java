package Assignment4;

//class created
class BankAccount{
	String accountHolderName;
	String bankName;
	double accountBalance;

//Constructor
public BankAccount(String accountHolderName,String bankName,double accountBalance)
{
	this.accountHolderName=accountHolderName;
	this.bankName=bankName;
	this.accountBalance=accountBalance;
}
//method
public double getBalance() {
    return accountBalance;
}
//Depoite method
public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Successfully deposit");
        System.out.println("Amount after deposite is: "+accountBalance);
    
}
//Withdraw method
public void withdraw(double amount) {
    if (amount < accountBalance) {
        accountBalance -= amount;
        System.out.println("Successfully Withdraw");
        System.out.println(" Amount after withdraw is: "+accountBalance);
    }
    else
    {
    System.out.println("Amount under lie limit");
    }
}
}

public class Amount{
	public static void main(String[] args) {
		//3 object creation
		BankAccount Bank1 =new BankAccount("Mohit","ICICI",25000);
		BankAccount Bank2 =new BankAccount("Rohit","HDFC",30000);
		BankAccount Bank3 =new BankAccount("Suman","SBI",45000);
		//calling method deposit and withdraw
	    Bank1.deposit(20000);
	    Bank1.withdraw(3000);
	    Bank2.deposit(1000);
	    Bank2.withdraw(32000);
	    Bank3.deposit(8000);
	    Bank3.withdraw(500);
	}

}
