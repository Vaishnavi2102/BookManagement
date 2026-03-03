public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Sample Books
        library.addBook(new Book("Atomic Habits", "James Clear", 320));
        library.addBook(new Book("Clean Code", "Robert C. Martin", 450));

        System.out.print("Enter your name: ");
        User user = new User(scanner.nextLine());

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. View Books");
            System.out.println("2. Start Reading");
            System.out.println("3. Update Progress");
            System.out.println("4. Add Review");
            System.out.println("5. View Reviews");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    library.showBooks();
                    break;

                case 2:
                    System.out.print("Enter book title to start: ");
                    String startTitle = scanner.nextLine();
                    Book startBook = library.findBookByTitle(startTitle);
                    if (startBook != null) {
                        user.startReading(startBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    String updateTitle = scanner.nextLine();
                    Book updateBook = library.findBookByTitle(updateTitle);
                    if (updateBook != null) {
                        System.out.print("Enter page number: ");
                        int page = scanner.nextInt();
                        user.updateProgress(updateBook, page);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter book title: ");
                    String reviewBook = scanner.nextLine();
                    System.out.print("Rating (1-5): ");
                    int rating = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Comment: ");
                    String comment = scanner.nextLine();

                    library.addReview(new Review(user.getName(), reviewBook, rating, comment));
                    System.out.println("Review added.");
                    break;

                case 5:
                    library.showReviews();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
