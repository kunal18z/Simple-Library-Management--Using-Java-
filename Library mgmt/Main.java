import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> library.addBook();
                case 2 -> library.displayBooks();
                case 3 -> library.searchBook();
                case 4 -> library.deleteBook();
                case 5 -> System.out.println("📤 Exiting...");
                default -> System.out.println("❌ Invalid choice. Try again.");
            }
        } while (choice != 5);
    }
}