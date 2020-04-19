package tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortInputIntegerArray {

  public static void main(String[] args) {
    System.out.println("First Way:");
    for (Integer output : sortInputArray(Arrays.asList(-4, -2, 0, 3, 6))) {
      System.out.println(output);
    }
    System.out.println("Second Way:");
  }

  public static List<Integer> sortInputArray(List<Integer> input) {
    List<Integer> output = input.stream().map(item -> item * item).collect(Collectors.toList());
    Collections.sort(output);
    return output;
  }
}