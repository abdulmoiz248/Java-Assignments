public class Demodriver {
    public static void main(String[] args) {
       //create some books
        Fiction novel=new Fiction(1,"The Alchemist",600,"Adventure",208);
        nonFiction biography=new nonFiction(2,"Steve Jobs",900,"Biography","Simon & Schuster");
        childrenBook picturebook=new childrenBook(3,"The very Hungry caterpillar",300,"2-5 year","Eric Carle");

        bookRental rental1=new bookRental(novel,14);
        bookRental rental2=new bookRental(biography,7);
        bookRental rental3=new bookRental(picturebook,7);

        rentedBooks rentedbooks=new rentedBooks();
        rentedbooks.addrentals(rental1);
        rentedbooks.addrentals(rental2);
        rentedbooks.addrentals(rental3);

        libraryMember member=new libraryMember("Musa","musa@example.com");
        member.setRb(rentedbooks);
        member.displayRentedbooks();
        Book b=new Book(picturebook);
        System.out.println(b);
    }
}
