import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("./output.txt")));
    int inputsCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    String[] inputs = new String[inputsCount];
    for (int i = 0; i < inputsCount; i++) {
      String inputsItem = scanner.nextLine();
      inputs[i] = inputsItem;
    }
    int[] res = usernameDisparity(inputs);
    for (int i = 0; i < res.length; i++) {
      bufferedWriter.write(String.valueOf(res[i]));
      if (i != res.length - 1) {
        bufferedWriter.write("\n");
      }
    }
    bufferedWriter.newLine();
    bufferedWriter.close();
    scanner.close();
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
