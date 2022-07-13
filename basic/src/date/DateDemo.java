package basic.src.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df2 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
        System.out.println(df.format(new Date()) + " " + df2.format(new Date()));

        SimpleDateFormat f = new SimpleDateFormat("yyy-MM-dd HH-mm-ss");
        System.out.println(f.format(new Date()));
    }
}
