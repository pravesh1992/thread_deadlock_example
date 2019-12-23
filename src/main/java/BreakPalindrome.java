import java.util.LinkedHashMap;
import java.util.Map;

public class BreakPalindrome {

  public static void main(String[] args) {
    String inputString = "aaa";
    System.out.println("BreakDown Palindrome:" + breakPalindrome(inputString));
  }

  public static String breakPalindrome(String inputString) {
    String result = "IMPOSSIBLE";
    if (inputString != null && !inputString.isEmpty()) {
      Map<String, Integer> map = new LinkedHashMap<>();
      char[] charArr = inputString.toCharArray();
      for (char temp : charArr) {
        if (map.containsKey("" + temp)) {
          int count = map.get("" + temp);
          count++;
          map.put("" + temp, 1);
        } else
          map.put("" + temp, 1);
      }

      if (map.size() == 1)
        return result;
      else {

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
          char inputChar = entry.getKey().toCharArray()[0];
          for (int i = 97; i < 122; i++) {
            StringBuilder newInputString = new StringBuilder(inputString);
            newInputString.replace(inputString.indexOf(inputChar), inputString.indexOf(inputChar) + 1, "" + ((char) i));
            if (!checkPalindrome(newInputString.toString()))
              return newInputString.toString();
          }
        }
      }
    }
    return result;
  }


  public static boolean checkPalindrome(String original) {
    StringBuffer newInputString = new StringBuffer();
    newInputString.reverse();
    if (original.equalsIgnoreCase(newInputString.toString()))
      return true;
    else
      return false;
  }
}
