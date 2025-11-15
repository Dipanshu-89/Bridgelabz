import java.time.*;
import java.time.format.DateTimeFormatter;
class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("GMT Time: " + gmt.format(f));
        System.out.println("IST Time: " + ist.format(f));
        System.out.println("PST Time: " + pst.format(f));
    }
}

