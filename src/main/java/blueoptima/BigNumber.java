package blueoptima;

public class BigNumber {

  public static void main(String[] args) {
    System.out.println(FindBigNum(3));
  }

  static long FindBigNum(long n) {
    long result = 0;
    StringBuilder binaryString = new StringBuilder();
    if (n > 0) {
      for (int i = 1; i < n + 1; i++) {
        binaryString.append(Integer.toBinaryString(i));
      }
      result = Long.parseLong(binaryString.toString(), 2);
    }

    return result;
  }
}