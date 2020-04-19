package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamSumExample {

  public static void main(String[] args) {
    int arr[] = {10, 19, 52, 104, 14};
    System.out.println(MaxHeapChecker(arr));
  }

  public static int MaxHeapChecker(int[] arr) {
    if (arr != null && arr.length > 0) {
      List<Integer> items = new ArrayList<>();
      int result = arr[0];
      for (int i = 1; i < arr.length; i++) {
        if (arr[i] > result) {
          items.add(result);
          result = arr[i];
        }
      }

      int sum = 0;
      for (int number : items) {
        System.out.println(number);
        sum += number;
      }


      return sum;
    }
    return arr[0];
  }


  int result(int[] arr, int mazSize, int result) {
    int sum = 0;

    return sum;
  }
}
