public class Book extends LibraryItem implements LoanItem 
{
    private String author;
    private String title;
    private int numPages;

    public Book(String ID, String author, String title, int numPages) {
        super("Book", ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    @Override
    public double calculatePrice() 
    {
        return numPages * 0.10;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author;
    }
}
