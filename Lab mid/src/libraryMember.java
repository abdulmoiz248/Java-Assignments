public class libraryMember {
    String name;

    String email;
    rentedBooks rb=new rentedBooks();

    public libraryMember() {
    }

    public libraryMember(String name, String email) {
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public rentedBooks getRb() {
        return rb;
    }

    public void setRb(rentedBooks rb) {
        this.rb = rb;
    }

    public void displayRentedbooks()
    {
        System.out.println("Library Member: "+name);
        System.out.println("Email: "+email);
        System.out.println("Rented Books: ");
        for (int i = 0; i < rb.rentals.length; i++)
            if (rb.rentals[i].book.title != null) {
                System.out.println("Book: " +rb.rentals[i].book.title+", Rental Period: "+rb.rentals[i].rentalperiod+" days");
            }
    }

    @Override
    public String toString() {
        return "Name='" + name + ", Email='" + email +", Rented Books=" + rb;
    }
}
