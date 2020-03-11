package stream;

import java.util.ArrayList;
import java.util.List;

public class ListMax {


  public static void main(String[] args) {
    int n = 5;
    List<List<Integer>> items = new ArrayList<>();
    ArrayList<Integer> item1 = new ArrayList<>();
    item1.add(1);
    item1.add(2);
    item1.add(100);
    items.add(item1);

    item1 = new ArrayList<>();
    item1.add(2);
    item1.add(5);
    item1.add(100);
    items.add(item1);

    item1 = new ArrayList<>();
    item1.add(3);
    item1.add(4);
    item1.add(100);
    items.add(item1);


    System.out.println(listMax(n, items));
  }

  public static long listMax(int n, List<List<Integer>> operations) {
    long result = 0;
    int rowCount = operations.size();
    int column = operations.get(0).size();
    int[][] finalArray = new int[rowCount][column];
    int i = 0;
    for (List<Integer> items : operations) {
      int j = 0;
      for (Integer data : items) {
        finalArray[i][j] = data;
        j++;
      }
      i++;
    }

    Integer[] outputArray = new Integer[n];
    for (int p = 0; p < n; p++) {
      outputArray[p] = new Integer(0);
    }


    List<Integer> items = new ArrayList<>(n);
    for (List<Integer> itemsAgain : operations) {
      int rowNumber = itemsAgain.get(0);
      int columnNumber = itemsAgain.get(1);
      int finalNumber = finalArray[rowNumber - 1][2];
      for (int k = rowNumber; k <= columnNumber; k++) {
        outputArray[k - 1] = outputArray[k - 1] + finalNumber;
      }
    }

    Integer resultInterger = 0;
    for (Integer integermax : outputArray) {

      if (integermax > resultInterger)
        resultInterger = integermax;
    }
    System.out.println(resultInterger);

    return resultInterger;
  }
}
