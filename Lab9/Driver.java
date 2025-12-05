public class Driver 
{
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[2];

        items[0] = new Book("B001", "J.K. Rowling", "Harry Potter", 500);
        items[1] = new CD("C001", "The Beatles", "Abbey Road", 17);

        for (LibraryItem item : items) 
        {
            System.out.println(item);

            LoanItem loanItem = (LoanItem) item;
            System.out.println("Price: " + loanItem.calculatePrice());
            System.out.println();
        }
    }
}
