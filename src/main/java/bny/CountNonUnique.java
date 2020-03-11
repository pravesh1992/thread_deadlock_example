package bny;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNonUnique {

  public static void main(String[] args) {
    System.out.println(countNonUnique(Arrays.asList(1, 3, 1, 4, 5, 6, 3, 2)));
  }


  public static int countNonUnique(List<Integer> numbers) {
    int result = 0;
    if (numbers != null && !numbers.isEmpty()) {
      Map<Integer, Integer> numberVsCount = new HashMap<>();
      for (Integer number : numbers) {
        Integer counter = 1;
        if (numberVsCount.containsKey(number)) {
          counter = numberVsCount.get(number);
          counter++;

        }
        numberVsCount.put(number, counter);
      }
      numberVsCount.entrySet().removeIf(item -> item.getValue() == 1);
      result = numberVsCount.size();
    }
    return result;
  }
}
