package common;

import java.util.Arrays;

public class StringTest {
//  public static void main(String[] args) throws Exception {
//    String longString = "This string is very long.";
//    String other = "This string" + " is " + "very long.";
//    System.out.println(longString == other); //prints true
//  }

  public static void main(String[] args) throws Exception {
    String longString = "This string is very long.";
    String is = " is ";
    String other = "This string" + is + "very long.";
    System.out.println(longString == other); //prints false

    System.out.println(String.join("OR", Arrays.asList("1234", "567")));
  }
}