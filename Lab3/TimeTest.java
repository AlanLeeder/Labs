public class TimeTest 
{
    public static void main(String[] args) 
	{
        Time t = new Time(23, 59, 59);

        System.out.println(t.toMilitaryString());
        System.out.println(t.toString());

        t.tick(); // advance one second

        System.out.println(t.toMilitaryString());
        System.out.println(t.toString());
    }
}