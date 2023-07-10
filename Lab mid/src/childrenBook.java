public class childrenBook extends Book{
String ageGroup;
String illustrator;

    public childrenBook(childrenBook c) {
        c.ageGroup = this.ageGroup;
        c.illustrator = this.illustrator;
        c.bookId=this.bookId;
        c.title=this.title;
        c.price=this.price;
    }


    public childrenBook(int id, String title, double price, String ageGroup, String illustrator) {
        this.ageGroup = ageGroup;
        this.illustrator = illustrator;
        this.bookId=id;
        this.title=title;
        this.price=price;
    }

    public childrenBook() {
    }

    public childrenBook(String ageGroup, String illustrator) {
        this.ageGroup = ageGroup;
        this.illustrator = illustrator;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    @Override
    public String toString() {
        return "AgeGroup='" + ageGroup + ", Illustrator='" + illustrator ;
    }
}
