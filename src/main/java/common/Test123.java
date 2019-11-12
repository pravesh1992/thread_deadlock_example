package common;

import java.util.ArrayList;
import java.util.Collections;

public class Test123 {

//  public int solution(int[] array) {
//    int result = 0;
//    int tempResult = 0;
//    if (array != null && array.length > 0) {
//      for(int i=0;i<array.length;i++)
//      {
//        if(i==0)
//          tempResult=array[i];
//        else
//          tempResult = tempResult * array[i];
//      }
//    }
//
//    if (tempResult > 0)
//      result = 1;
//    else if (tempResult < 0)
//      result = -1;
//    return result;
//  }

  public int solution(int[] array) {
    int result = 0;
    ArrayList<Integer> allResult = new ArrayList<>();
    if (array != null && array.length > 0) {
      ArrayList<String> testList = new ArrayList<>();
      for (int item : array) {
        StringBuilder testStr = new StringBuilder(new String(item + ""));
        String reverseTestStr = testStr.reverse().toString();
        if (testList.contains(reverseTestStr)) {
          Integer original = item;
          Integer reverseValue = Integer.parseInt(reverseTestStr);
          allResult.add(original + reverseValue);
        }
        testList.add(reverseTestStr);
      }
      Collections.sort(allResult);
      result = allResult.get(allResult.size() - 1);
    }
    return result;
  }

  public static void main(String[] args) {
    Test123 test123 = new Test123();
    int arr[] = {51, 71, 17, 42};
    System.out.println("Result:" + test123.solution(arr));
  }
}
