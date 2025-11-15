import java.time.*;
import java.time.format.*;

interface DateUtil {
    static String format(LocalDate d) {
        return d.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}

class DemoDate {
    public static void main(String[] args) {
        System.out.println(DateUtil.format(LocalDate.now()));
    }
}

