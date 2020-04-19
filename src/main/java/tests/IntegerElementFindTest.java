package tests;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntegerElementFindTest {

  public static void main(String[] args) {
    Map<Integer, Long> numberToCount = numberToCount(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1, 11, 11, 11, 11, 11));
    System.out.println("Number of Occurrence:" + numberToCount.getOrDefault(11, 0l));
  }

  static Map<Integer, Long> numberToCount(List<Integer> numbers) {
    //Map<Integer, Long> numberToCount = numbers.stream().mapToInt(item -> item).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    //numbers.stream().mapToInt(item->item).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    //Map<Integer, Long> characterToCount = numbers.stream().mapToInt(item -> item).mapToObj(item -> (Integer) item).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    //return numbers.stream().mapToInt(item -> item).mapToObj(item -> item).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    return numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}
