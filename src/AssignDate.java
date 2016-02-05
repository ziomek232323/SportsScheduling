import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.jacop.core.*;
import org.jacop.constraints.*;
import org.jacop.constraints.*;
public class AssignDate {


    public void setDate() throws IOException {
        //first match August 8th

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm");
        Calendar calendar = new GregorianCalendar(2015, 7, 8, 17, 00);
        String date = "";
        //ArrayList date1 = new ArrayList();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        date = (sdf.format(calendar.getTime()));

        writeDate(date);
    }

    public void getDay() {
        Calendar c = Calendar.getInstance();
        c.set(1994, Calendar.JULY, 24);

        int day_of_week = c.get(Calendar.DAY_OF_WEEK);
        String day = "";

        if (day_of_week == 1) {
            day = "Sunday";
        } else if (day_of_week == 2) {
            day = "Monday";
        } else if (day_of_week == 3) {
            day = "Tuesday";
        } else if (day_of_week == 4) {
            day = "Wednesday";
        } else if (day_of_week == 5) {
            day = "Thursday";
        } else if (day_of_week == 6) {
            day = "Friday";
        } else if (day_of_week == 7) {
            day = "Saturday";
        }

        System.out.println("Day of the week: " + day);
    }

    public void writeDate(String date) throws IOException {
        PrintWriter out = (new PrintWriter(new BufferedWriter(new FileWriter("./src/table.txt", true))));
        System.out.println("This is a date: "+ date );
        BufferedReader br = new BufferedReader(new FileReader("./src/table.txt"));
        String line;

        List<String> temps = new ArrayList<String>();
        while ((line = br.readLine()) != null ) {
             {
                temps.add(line + " " + date);

            }

        }
        /*
        for(String s : temps) {
            System.out.println("This is fixture with date: " + s);

            out.write(s);
        }
    */
    }
}