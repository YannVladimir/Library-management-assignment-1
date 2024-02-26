import java.util.Random;
import java.util.Scanner;

public class Book {
    // Here I am defining the fields to be used
    private String title;
    private String author;
    private Genre genre;
    private double price;
    private int quantityInStock;

    // Default constructor for random details
    public Book() {
        generateRandomDetails();
    }

    // Method that will help to manually set book details
    public void setBookDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book Details:");

        System.out.print("Title: ");
        title = scanner.nextLine();
        System.out.print("Author: ");
        author = scanner.nextLine();

        // Display available genres from the Genre class
        System.out.print("Genre (choose from :");
        for (Genre availableGenre : Genre.values()) {
            System.out.print(availableGenre + ", ");
        }
        System.out.print("): ");

        // Now exception handling to hanlde Genre inputs once it is not available in Genre Class
        try {
            genre = Genre.valueOf(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid genre. Please choose from the available genres.");
            setBookDetails(); // Retry to set details
            return;
        }

        System.out.print("Price: ");
        price = scanner.nextDouble();
        System.out.print("Quantity in Stock: ");
        quantityInStock = scanner.nextInt();
    }

    // Now another method to generate random details
    private void generateRandomDetails() {
        Random random = new Random();
        title = "Random Book Title";
        author = "Random Author";
        genre = Genre.values()[random.nextInt(Genre.values().length)];
        price = random.nextDouble() * 50.0; // Random price between 0 and 50
        quantityInStock = random.nextInt(100) + 1; // Random quantity between 1 and 100
    }

    // Now Getters of this class
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    // Add other methods, setters if needed
}
