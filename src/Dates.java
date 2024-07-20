// Example 13: Working with dates and times

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Dates {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Current date and time: " + now);

        SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
        System.out.println("Formatted date and time: " + sdf.format(now));

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Date in long format: " + dateFormat.format(now));
    }
}
