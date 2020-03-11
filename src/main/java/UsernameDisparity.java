public class UsernameDisparity {
  public static void main(String[] args) {
    int[] result = usernameDisparity(new String[]{"ababaa", "ababa", "aa"});
    for (int temp : result) {
      System.out.println(temp);
    }
  }

  static int[] usernameDisparity(String[] inputs) {
    if (inputs != null && inputs.length > 0) {
      int[] resultArray = new int[inputs.length];
      int index = 0;
      for (String temp : inputs) {
        resultArray[index] = usernameDisparity(temp);
        index++;
      }
      return resultArray;
    }
    return new int[0];
  }

  static int usernameDisparity(String input) {
    if (input != null && !input.isEmpty()) {
      int result = 0;
      for (int index = 0; index < input.length(); index++) {
        String[] contentArr = splitValue(input, index).split(",");
        if (contentArr[1].length() > contentArr[0].length()) {
          result += contentArr[1].startsWith(contentArr[0]) ? contentArr[1].length() : 0;
        } else {
          result += contentArr[0].startsWith(contentArr[1]) ? contentArr[1].length() : 0;
        }
      }
      return result;
    } else {
      return 0;
    }
  }

  static String splitValue(String value, int index) {
    return value.substring(0, index) + "," + value.substring(index);
  }
}