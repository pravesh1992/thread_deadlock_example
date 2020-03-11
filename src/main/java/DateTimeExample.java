import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeExample {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    Date date = simpleDateFormat.parse("2019-09-09T06:17:48");
    System.out.println(date);
  }
}
