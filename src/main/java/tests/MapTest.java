package tests;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
  public static void main(String[] args) {
    Map<String, Object> map = new HashMap<>();
    map.put("abc", "Test");
    System.out.println((String) map.getOrDefault("abc", "abc"));
    System.out.println((String) map.getOrDefault("323c", null));
  }
}