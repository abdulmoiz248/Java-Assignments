public class Fiction extends Book{
    String genre;
    int pagecount;

    public Fiction(Fiction f) {
         f.genre=this.genre ;
         f.pagecount=this.pagecount ;
        f.bookId=this.bookId;
        f.title=this.title;
       f.price= this.price;
    }

    public Fiction() {
    }

    public Fiction(int id, String title, double price, String genre, int pagecount) {
        this.genre = genre;
        this.pagecount = pagecount;
        this.bookId=id;
        this.title=title;
        this.price=price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    @Override
    public String toString() {
        return "Genre='" + genre + ", Pagecount=" + pagecount + ", BookId=" + bookId + ", Title='" + title + ", Price=" + price ;
    }
}
