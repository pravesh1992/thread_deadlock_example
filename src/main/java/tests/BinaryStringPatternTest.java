package tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryStringPatternTest {
  static boolean isPattern(long num) {
    String[] stringPatternsMatch = new String[]{"01", "10"};
    String[] stringPatternsNotMatch = new String[]{"00", "11"};
    return isPatternMatched(num, stringPatternsMatch, stringPatternsNotMatch);
  }

  public static void main(String[] args) {
    if (isPattern(5)) {
      System.out.println("Yes");
    } else
      System.out.println("NO");
  }


  static boolean isPatternMatched(long num, String[] patternStrings, String[] stringPatternsNotMatch) {
    String binaryString = Long.toBinaryString(num);
    boolean matchResult = false;
    for (String patternString : patternStrings) {
      Pattern pattern = Pattern.compile(patternString);
      Matcher m = pattern.matcher(binaryString);
      while (m.find()) {
        matchResult = true;
        break;
      }
    }

    boolean notMatchResult = false;
    for (String patternString : stringPatternsNotMatch) {
      Pattern pattern = Pattern.compile(patternString);
      Matcher m = pattern.matcher(binaryString);
      while (m.find()) {
        notMatchResult = true;
        break;
      }
    }
    if (notMatchResult)
      return true;
    else
      return false;
  }
}
