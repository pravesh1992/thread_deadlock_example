package tests;

import java.util.Arrays;
import java.util.List;

public class SwapIntegerArray {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("UnSwapped Array:");
    for (Integer item : numbers) {
      System.out.print(item + ",");
    }
    System.out.println("");
    System.out.println("Swapped Array:");
    for (Integer item : swappedIntegerArray(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})) {
      System.out.print(item + ",");
    }
  }

  static Integer[] swappedIntegerArray(Integer[] numbers) {
    for (int i = 0, j = numbers.length; i != j; i++) {
      j--;
      int temp = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = temp;
    }

    return numbers;
  }
}