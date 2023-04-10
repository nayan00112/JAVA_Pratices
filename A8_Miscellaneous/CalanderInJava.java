import java.util.Calendar;

public class CalanderInJava {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance();
        // c.YEAR = 2001;
        // c.DATE = 10;
        // c.MONTH = 4;

        // System.out.println(c.getFirstDayOfWeek());
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getWeekYear());
        System.out.println(c.get(0));
        System.out.println(c.getCalendarType());
        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getTimeInMillis());
        System.out.println(c.getLeastMaximum(0));


    }
}


// Output:
// 1
// gregory
// 1
// 1681149824766
// 1
