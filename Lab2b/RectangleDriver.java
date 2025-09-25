public class RectangleDriver 
{
    public static void main(String[] args) 
    {
        Rectangle Rec = new Rectangle();

        Rec.setLength(5);
        Rec.setWidth(10);
        Rec.setArea(5 * 10);
        Rec.setPerimeter(5 + 5 + 10 + 10);
        Rec.PrintRectangle();

        
        System.out.println(Rec);
    }
}
