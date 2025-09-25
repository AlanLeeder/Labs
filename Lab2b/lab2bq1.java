class Rectangle
{
    private int length;
    private int width;
    private int area;
    private int perimeter; 
    private int printRectangle;

    public Rectangle()
    {
        setLength(1);
        setWidth(1);
        setArea(0);
        setPerimeter(0);
    }

    public void setLength(int length)
    {
        if(length >0.0 && length <=40.0)
        {
            this.length = length;
        }
    }

     public int getLength()
    {
        return length;
    }

    public void setWidth(int width)
    {
        if(width >0.0 && width <40.0)
        {
            this.width = width;
        }
    }

    public int getWidth()
    {
        return width;
    }

    public void setArea(int area)
    {
        this.area = area;
    }

    public int getArea()
    {
        return area;
    }

    public void setPerimeter(int perimeter)
    {
        this.perimeter = perimeter;
    }

    public int getPerimeter()
    {
        return perimeter;
    }

    public void PrintRectangle()
    {
        for(int index = 0; index < width; index ++)
        {
            for(int j = 0; j < length; j ++)
            {
                if(index == 0 || index == width -1 || j == 0 || j == length -1)
                {
                    System.out.print("*");
                }

                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public String toString()
    {
        return "Rectangle Length is " + length + ", Width is " + width + ", Area is " + area + " and Perimeter is " + perimeter; 
    }

    public int returnRectangle()
    {
        return printRectangle;
    }
} 