import java.util.HashMap;
import java.util.Map;

public class NullTest {
  public static void main(String[] args) {
    Map<String, Double> test = new HashMap<>();
    test.put("123", null);
    Double str = (Double) test.getOrDefault("123", 0.0);
    System.out.println(str);
  }
}