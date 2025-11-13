public class point 
{
    protected int x;
    protected int y;
    
    public point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getx()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String toString()
    {
        return x + " " + y;
    }
}
