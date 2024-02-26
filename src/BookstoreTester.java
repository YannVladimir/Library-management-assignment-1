import java.util.Scanner;

public class BookstoreTester {
    public static void main(String[] args) {
        // Firstly, i demonstrate the Book class with a random book
        Book randomBook = new Book();
        System.out.println("Book 1 Details");
        displayBookDetails(randomBook);

        // now Using a loop to prompt the user for details and add N number of books
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of additional books to add: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            Book newBook = new Book();
            newBook.setBookDetails(); // Manually set details for additional books
            System.out.println("\nBook " + (i + 2) + " details:"); // Here i start from 2 since the first book is random
            displayBookDetails(newBook);
        }
    }

    // Now a new method that displays book details
    private static void displayBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Genre: " + book.getGenre());
        System.out.printf("Price: $%.2f%n", book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQuantityInStock());
    }
}
