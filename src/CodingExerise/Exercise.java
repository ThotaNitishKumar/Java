package CodingExerise;

/*Coding Exercise: Constructors and Static Keyword
Create a Java program for a simple library system that manages books. Implement a class Exercise that keeps track of the total number of books created using static variables and methods. The class should include:

A constructor that initializes the book's title and author.

Static variables to keep track of the total number of books created.

Static methods to get the total number of books.

Instance methods to get the title and author of a book.*/

//Solution

/*Class Definition and Static Variable:



The Exercise class is defined with two private instance variables: title and author to store the book's details.

A static variable totalBooks is initialized to 0. This variable will keep track of the total number of Book instances created.

Constructor:



The constructor Exercise(String title, String author) takes the book's title and author as parameters.

Inside the constructor, the instance variables title and author are initialized with the provided values.

The static variable totalBooks is incremented by 1 every time a new Book object is created.

Static Method:



The static method getTotalBooks() returns the value of totalBooks. Since it's a static method, it can be called without creating an instance of the Exercise class.

Instance Methods:



The instance method getTitle() returns the title of the book.

The instance method getAuthor() returns the author of the book.

Main Method:



Inside the main method, three Exercise objects are created with different titles and authors.

The details of each book are printed using the instance methods getTitle() and getAuthor().

The total number of books created is printed using the static method getTotalBooks().

*/

public class Exercise {
    public String title;
    public String author;
    public static int totalBooks = 0;
 
    // Constructor to initialize book title and author
    public Exercise(String title, String author) {
    	this.title=title;
    	this.author=author;
    	totalBooks++;
    }
    public static int getTotalBooks() {
    	return totalBooks;
    } 
    public String getTitle() {
    	return title;
    }
    
    public String getAuthor() {
    	return author;
    }
    
    public static void main(String[] args) {
    	
    	Exercise book1 = new Exercise("1984", "George Orwell");
    	Exercise book2 = new Exercise("To Kill a Mockingbird", "Harper Lee");
        Exercise book3 = new Exercise("The Great Gatsby", "F. Scott Fitzgerald");
        
        System.out.println("Author name is : "+book1.author+" book title is : "+book1.title);
        System.out.println("Author name is : "+book2.author+" book title is  : "+book2.title);
        System.out.println("Author name is : "+book3.author+" book title is  : "+book3.title);
        
        
    }
}