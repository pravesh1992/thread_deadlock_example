package hackerrank;

import java.util.Arrays;
import java.util.List;

public class MaximumSumTest {

  public static void main(String[] args) {

    // List<Integer> items = Arrays.asList(1, 2, 3, 4, 5);
   //List<Integer> items = Arrays.asList(-1, -2, 1, 3);
    List<Integer> items = Arrays.asList(-1, 3, 4, -2, 5, -7);
    System.out.println(maximumSum(items));
  }

  public static long maximumSum(List<Integer> arr) {
    Long maximumSum = 0l;
    if (arr != null && !arr.isEmpty()) {
      Integer[] array = new Integer[arr.size()];
      for (int i = 0; i < arr.size(); i++) {
        array[i] = arr.get(i);
      }


      //Integer[] array = (Integer[]) arr.toArray();
      for (int i = 0; i < arr.size(); i++) {
        int count = arr.size();
        for (int j = i; j != count; j++) {
          Integer[] intArr = Arrays.copyOfRange(array, j, count);
          Long sumResult = sum(intArr);
          if (sumResult > maximumSum) {
            count--;
            maximumSum = sumResult;
          }
        }
      }
    }

    return maximumSum;
  }

  private static Long sum(Integer[] arr) {
    Long sum = 0L;
    int i;
    for (i = 0; i < arr.length; i++)
      sum += arr[i];
    return sum;
  }
}
