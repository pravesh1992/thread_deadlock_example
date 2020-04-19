package tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinimumCharInString {

  public static void main(String[] args) {
    System.out.println("Minimum Occurrence:" + getMinimumOccurrenceOfChar("cbbcaa322"));
  }

  public static char getMinimumOccurrenceOfChar(String input) {
    if (input.length() > 1) {
      Map<Character, Long> characterToCount = input.chars().mapToObj(item -> (char) item).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      List<Map.Entry<Character, Long>> entries = new ArrayList<>(characterToCount.entrySet());
      entries.sort(Comparator.comparing(Map.Entry::getValue));
      return entries.get(0).getKey();
    } else {
      return input.toCharArray()[0];
    }
  }
}