import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class VowelString {

  public static void main(String[] args) {
    System.out.println(vowelsubstring("aaeiouxa"));
    //System.out.println(vowelsubstring("axyzaeiou"));
    //System.out.println(vowelsubstring("tstikeaoaqqiiyemepiuxixuiooo"));
  }


  public static int vowelsubstring(String s) {
    int finalCount = 0;
    List<String> subStrings = subStrings(s);
    for (String temp : subStrings) {
      if (temp.length() >= 5) {
        int newCount = splittedStringCounts(temp);
        finalCount += newCount;
      }
    }

    return finalCount;
  }

  private static List<String> subStrings(String s) {
    HashSet<String> splittedStrings = new HashSet<>();
    if (s != null && !s.trim().isEmpty()) {
      String splittedString = "";
      for (char c : s.toCharArray()) {
        if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
          splittedString += c;
        } else {
          splittedStrings.add(splittedString);
          splittedString = "";
        }
      }
      splittedStrings.add(splittedString);
    }

    return new ArrayList<>(splittedStrings);
  }

  private static int splittedStringCounts(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      String subString = str.substring(i);
      if (subString.length() >= 5 && subString.contains("a") && subString.contains("e") && subString.contains("i") && subString.contains("o") && subString.contains("u"))
        count++;
    }

    return count;
  }
}