class Book {
    private String title;
    private String author;
    private int totalPages;

    public Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + totalPages);
    }
}
