import java.util.ArrayList;
import java.util.List;

public class TwoDArray {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    //2 3
    //3 7
    //4 1
    list.add("2 3");
    list.add("3 7");
    list.add("4 1");
    System.out.println( countMax(list));
  }

  public static long countMax(List<String> upRight) {
    long result = 0;
    int[][] ar = new int[upRight.size()][2];

    int i, j, p, q, temp, sum, final_sum = -99999;
    int row = 0;
    for (String str : upRight) {
      int coulumn = 0;
      String[] StringArr = str.split(" ");
      for (String columnString : StringArr) {
        ar[row][coulumn] = Integer.parseInt(columnString);
        coulumn++;
      }
    }

    for (i = 0; i < upRight.size(); i++) {
      for (j = 0; j < 2; j++) {
        sum = ar[i][j] + ar[i][j + 1] + ar[i][j + 2] + ar[i + 1][j + 1] + ar[i + 2][j] + ar[i + 2][j + 1] + ar[i + 2][j + 2];
        final_sum = Math.max(sum, final_sum);
      }
    }
    return result;
  }
}
