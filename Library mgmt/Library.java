import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("✅ Book added successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("❌ No books found.");
        } else {
            System.out.println("📚 Book List:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void searchBook() {
        System.out.print("Enter title to search: ");
        String keyword = scanner.nextLine();
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("✅ Found: " + book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ Book not found.");
        }
    }

    public void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String id = scanner.nextLine();
        boolean removed = books.removeIf(book -> book.getId().equals(id));

        if (removed) {
            System.out.println("✅ Book deleted.");
        } else {
            System.out.println("❌ Book not found.");
        }
    }
}