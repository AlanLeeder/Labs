public class CD extends LibraryItem implements LoanItem 
{
    private String band;
    private String title;
    private int numTracks;

    public CD(String ID, String band, String title, int numTracks) {
        super("CD", ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    @Override
    public double calculatePrice() 
    {
        return numTracks * 1.00;
    }

    @Override
    public String toString() {
        return "CD: " + title + " by " + band;
    }
}
