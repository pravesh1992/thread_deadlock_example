package tracelink;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test123 {
  public static void main(String[] args) {
    List<String> strings = Pattern.compile(" ")
      .splitAsStream("010|020202")
      .collect(Collectors.toList());
  }
}
