// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Student to store and manage student details
class Student
{
    // Instance variables with different access modifiers
    public String rollNumber;
    protected String name;
    private double CGPA;
    
    // Constructor to initialize the student details
    Student(String rollNumber, String name, double CGPA)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    
    // Public method to access CGPA
    public double getCGPA()
    {
        return CGPA;
    }
    
    // Public method to modify CGPA
    public void setCGPA(double CGPA)
    {
        this.CGPA = CGPA;
    }
}

// Creating a subclass PostgraduateStudent to demonstrate the use of protected members
class PostgraduateStudent extends Student
{
    // Constructor to initialize postgraduate student details
    PostgraduateStudent(String rollNumber, String name, double CGPA)
    {
        super(rollNumber, name, CGPA);
    }
    
    // Method to display postgraduate student details
    public void displayDetails()
    {
        System.out.println("Roll Number is " + rollNumber);
        System.out.println("Name is " + name);
        System.out.println("CGPA is " + getCGPA());
    }
}

// Creating Main class
class UniversityManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
	     Scanner input = new Scanner(System.in);
        
        // Taking user input for course details
        System.out.println("Enter the rollNumber of the  student ");
        String studentRollNumber = input.nextLine();
        System.out.println("Enter the name of the student ");
        String studentName = input.nextLine();
        System.out.println("Enter the CGPA of the student ");
        double cgpa = input.nextDouble();
	
        // Creating a PostgraduateStudent object
        PostgraduateStudent student = new PostgraduateStudent(studentRollNumber,studentName,cgpa);
        student.displayDetails();
        
        // Modifying CGPA using public method
        System.out.println("Enter the new CGPA "); 
        cgpa = input.nextDouble();
        student.setCGPA(cgpa);
        System.out.println("Updated CGPA is " + student.getCGPA());
    }
}
