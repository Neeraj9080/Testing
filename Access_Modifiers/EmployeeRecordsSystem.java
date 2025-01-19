// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Employee to store and manage employee details
class Employee
{
    // Instance variables with different access modifiers
    public String employeeID;
    protected String department;
    private double salary;
    
    // Constructor to initialize employee details
    Employee(String employeeID, String department, double salary)
    {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // Public method to modify salary
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    // Public method to access salary
    public double getSalary()
    {
        return salary;
    }
}

// Creating a subclass Manager to demonstrate access to employeeID and department
class Manager extends Employee
{
    // Constructor to initialize manager details
    Manager(String employeeID, String department, double salary)
    {
        super(employeeID, department, salary);
    }
    
    // Method to display manager details
    public void displayDetails()
    {
        System.out.println("Employee ID is " + employeeID);
        System.out.println("Department is " + department);
        System.out.println("Salary is " + getSalary());
    }
}

// Creating Main class
class EmployeeRecordsSystem
{
    // Main method
    public static void main(String[] args)
    {
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the employee ID ");
	   String employeeID = input.nextLine();
	   System.out.println("Enter the department name of the employee ");
	   String department = input.nextLine();
	   System.out.println("Enter the salary of the employee ");
	   double salary = input.nextDouble();
	   
        // Creating a Manager object
        Manager manager = new Manager(employeeID, department, salary);
        manager.displayDetails();
        
        // Modifying and displaying salary using public method
		System.out.println("Enter the updated salary of the employee  "); 
        salary = input.nextDouble();
        manager.setSalary(salary);
        System.out.println("Updated Salary is " + manager.getSalary());
    }
}
