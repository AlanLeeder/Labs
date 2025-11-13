public class circle 
{
    private point point;
    private int radius;
    
    public circle(int x, int y, int radius)
    {
        this.point = new point(x, y);
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return  point +  " " + radius;
    }
}
