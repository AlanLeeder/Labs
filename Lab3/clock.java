import java.util.Calendar;

public class clock {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        int startMinute = cal.get(Calendar.MINUTE);

        while (t.getMinute() == startMinute) {
            long startTime = System.currentTimeMillis();

            while (System.currentTimeMillis() - startTime < 1000) 
            {
                
            }

            t.tick();
            System.out.println(t);
        }

        System.out.println("One minute has passed — clock stopped.");
    }
}
