import java.util.Objects;

public  class Book {

        int bookId;
        String title;
        double price;

    public int getBookId() {
        return bookId;
    }

    public Book() {
    }

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public Book(Book b) {
        this.bookId=b.bookId;
        this.title= b.title;
        this.price=b.price;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(Book book) {
        return bookId == book.bookId && Double.compare(book.price, price) == 0 && Objects.equals(title, book.title);
    }

    @Override
    public String toString() {
        return "BookId=" + bookId + ", Title='" + title + ", Price=" + price ;
    }
}
