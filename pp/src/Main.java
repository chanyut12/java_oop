// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Book class
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        // Accessing methods of the object
        myBook.displayBookDetails();

        // Changing the title of the book
        myBook.setTitle("The Great Gatsby: A New Edition");
        myBook.displayBookDetails();
    }
}