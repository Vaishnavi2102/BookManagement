import java.util.HashMap;

class User {
    private String name;
    private HashMap<String, Integer> readingProgress;

    public User(String name) {
        this.name = name;
        this.readingProgress = new HashMap<>();
    }

    public void startBook(Book book) {
        readingProgress.put(book.getTitle(), 0);
        System.out.println("Started reading " + book.getTitle());
    }

    public void updateProgress(Book book, int page) {
        readingProgress.put(book.getTitle(), page);
        System.out.println("Progress updated to page " + page);
    }

    public void viewProgress() {
        System.out.println(readingProgress);
    }
}
