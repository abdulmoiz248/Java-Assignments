public class nonFiction extends Book{
    String subject;
    String publisher;

    public nonFiction(nonFiction f) {
         f.subject=this.subject ;
         f.publisher=this.publisher ;
      f.bookId=this.bookId;
        f.title=this.title;
        f.price=this.price;
    }

    public nonFiction(int id, String title, double price, String subject, String publisher) {
        this.subject = subject;
        this.publisher = publisher;
        this.bookId=id;
        this.title=title;
        this.price=price;
    }

    public nonFiction(String subject, String publisher) {
        this.subject = subject;
        this.publisher = publisher;
    }

    public nonFiction() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Subject='" + subject +", Publisher='" + publisher + ", BookId=" + bookId + ", Title='" + title +  ", Price=" + price ;
    }
}
