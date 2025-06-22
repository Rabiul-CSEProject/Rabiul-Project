import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String FormattedTime = time.format(Formatter);
        System.out.println(FormattedTime);
    }

}
