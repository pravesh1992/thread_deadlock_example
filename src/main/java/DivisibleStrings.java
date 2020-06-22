public class DivisibleStrings {
  public static void main(String[] args) {
    System.out.println("SmallString:" + findSmallestDivisor("bcdbcdbcdbcd", "bcdbcd"));
  }

  public static int findSmallestDivisor(String s, String t) {
    return validationString(s, t) ? smallString(s, t).length() : -1;
  }

  private static String smallString(String s, String t) {
    String smallString = "";
    String finalNewSmall = "";
    for (int i = 0; i < t.length(); i++) {
      smallString += t.charAt(i);
      String newSmallString = smallString;
      boolean validated = false;
      if (validationString(s, newSmallString) && validationString(t, newSmallString)) {
        validated = true;
      }
      if (validated) {

        finalNewSmall = smallString;
        break;
      }
    }
    return finalNewSmall;
  }

  private static boolean validationString(String s, String t) {
    if (s == null || s.trim().isEmpty() || t == null || t.trim().isEmpty()) {
      return false;
    } else {
      if (s.contains(t)) {
        if (s.equals(t))
          return true;
        String newString = t;
        for (int i = 0; s.length() >= newString.length(); i++) {
          if (s.length() <= newString.length() && s.equals(newString)) {
            return true;
          }
          newString += t;
        }
      }
      return false;
    }
  }
}
