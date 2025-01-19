// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Book to store and manage book details
class Book
{
    // Instance variables with different access modifiers
    public String ISBN;
    protected String title;
    private String author;
    
    // Constructor to initialize book details
    Book(String ISBN, String title, String author)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    // Public method to set the author name
    public void setAuthor(String author)
    {
        this.author = author;
    }
    
    // Public method to get the author name
    public String getAuthor()
    {
        return author;
    }
}

// Creating a subclass EBook to demonstrate access to ISBN and title
class EBook extends Book
{
    // Constructor to initialize EBook details
    EBook(String ISBN, String title, String author)
    {
        super(ISBN, title, author);
    }
    
    // Method to display EBook details
    public void displayDetails()
    {
        System.out.println("ISBN Number is " + ISBN);
        System.out.println("Title of book is " + title);

    }
}

// Creating Main class
class BookLibrarySystem
{
    // Main method
    public static void main(String[] args)
    {
	   Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the ISBN number of the book ");
	   String isbnNumber = input.nextLine();
	   System.out.println("Enter the title of the book ");
	   String title = input.nextLine();
	   System.out.println("Enter the author of the book ");
	   String author = input.nextLine();
	   
        // Creating an EBook object
        EBook eBook = new EBook(isbnNumber, title, author);
        eBook.displayDetails();
        
        // Setting and getting the author name using public methods
		System.out.println("Enter the new author name of the book ");
	    author = input.nextLine();
        eBook.setAuthor(author);
        System.out.println("Updated Author name is " + eBook.getAuthor());
    }
}
