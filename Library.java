class Library {
    private List<Book> books;
    private List<Review> reviews;

    public Library() {
        books = new ArrayList<>();
        reviews = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayInfo();
            }
        }
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void showReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
        } else {
            for (Review review : reviews) {
                review.displayReview();
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
