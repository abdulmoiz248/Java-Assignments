import java.util.Arrays;

public class rentedBooks {
    bookRental rentals[]=new bookRental[10];


    public rentedBooks() {
        for(int i=0;i<this.rentals.length;i++)
            this.rentals[i]=new bookRental();
    }
    public void addrentals(bookRental b)
    {
        for(int i=0;i<this.rentals.length;i++)
            if (rentals[i].book.title == null)
            {
                rentals[i]=b;
                break;
            }
    }

    public void display(){
        System.out.println("Rented Books");
        for (int i = 0; i < rentals.length; i++)
            if (rentals[i].book.title != null) {
                System.out.println("Book: " +rentals[i].book.title+"Rental Period: "+rentals[i].rentalperiod);
            }

    }


}
