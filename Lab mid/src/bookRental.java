public class bookRental {
    Book book=new Book();
    int rentalperiod;

    public bookRental() {
    }
    public bookRental(bookRental b) {
        b.book = this.book;
        b.rentalperiod = this.rentalperiod;
    }

    public bookRental(Book book, int rentalperiod) {
        this.book = book;
        this.rentalperiod = rentalperiod;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getRentalperiod() {
        return rentalperiod;
    }

    public void setRentalperiod(int rentalperiod) {
        this.rentalperiod = rentalperiod;
    }

    @Override
    public String toString() {
        return "Book=" + book + ", Rentalperiod=" + rentalperiod ;
    }
    public void clone(bookRental bookrental)
    {
        this.rentalperiod=bookrental.rentalperiod;
        this.book.bookId=bookrental.book.bookId;
        this.book.price=bookrental.book.price;
        this.book.title=bookrental.book.title;
    }

}
