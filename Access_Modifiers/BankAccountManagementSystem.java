// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class BankAccount to manage account details
class BankAccount
{
    // Instance variables with different access modifiers
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    
    // Constructor to initialize bank account details
    BankAccount(String accountNumber, String accountHolder, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    // Public method to access balance
    public double getBalance()
    {
        return balance;
    }
    
    // Public method to modify balance
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
}

// Creating a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder
class SavingsAccount extends BankAccount
{
    // Constructor to initialize savings account details
    SavingsAccount(String accountNumber, String accountHolder, double balance)
    {
        super(accountNumber, accountHolder, balance);
    }
    
    // Method to display savings account details
    public void displayDetails()
    {
        System.out.println("Account Number is " + accountNumber);
        System.out.println("Account Holder is " + accountHolder);
        System.out.println("Balance is " + getBalance());
    }
}

// Creating Main class
class BankAccountManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the account number ");
	   String accountNumber = input.nextLine();
	   System.out.println("Enter the account holder name ");
	   String accountHolder = input.nextLine();
	   System.out.println("Enter the current balance of the account ");
	   double balance = input.nextDouble();
	
        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolder, balance);
        savingsAccount.displayDetails();
        
        // Modifying and displaying balance using public methods
		System.out.println("Enter the new current balance  "); 
        balance = input.nextDouble();
        savingsAccount.setBalance(balance);
        System.out.println("Updated Balance is " + savingsAccount.getBalance());
    }
}
