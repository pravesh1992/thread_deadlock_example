package stream;

public class JumpResult {
  public static void main(String[] args) {
    System.out.println("Count Jumps : " + jumps(3, 3));
  }

  public static int jumps(int k, int j) {
    int result = 0;
    int countJumps = 0;
    if(k==j)
      return 1;
    while (countJumps <= k) {
      if ((countJumps + j) >= k) {
        j = 1;
      }
      if ((countJumps + j) > k)
        break;;
        countJumps = countJumps + j;
      result++;
    }

    return result;
  }
}
