// Defining the Book class
public class Book {

    // Attributes (or fields) of the class
    private String title;
    private String author;
    private int pageCount;

    // Constructor to initialize the object
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Getter method for pageCount
    public int getPageCount() {
        return pageCount;
    }

    // Setter method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Setter method for pageCount
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book: " + title + ", Author: " + author + ", Pages: " + pageCount);
    }
}

// Main class to run the program
// public class Main {
//     public static void main(String[] args) {
//         // Creating an object of the Book class
//         Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

//         // Accessing methods of the object
//         myBook.displayBookDetails();

//         // Changing the title of the book
//         myBook.setTitle("The Great Gatsby: A New Edition");
//         myBook.displayBookDetails();
//     }
// }
