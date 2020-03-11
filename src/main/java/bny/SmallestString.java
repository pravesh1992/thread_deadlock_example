package bny;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestString {
  public static void main(String[] args) {
    ArrayList<String> products = new ArrayList<>();
    products.add("dd");
    products.add("dda");
    products.add("ddb");
    System.out.println("Result:" + smallestString(products));
  }

  public static String smallestString(List<String> substrings) {
    String result = "";
    result = substrings.stream().sorted(Comparator.naturalOrder()).collect(Collectors.joining());
    return result;
  }
}