package thread.MyThread1;

public class Result {

  public static void fizzBuzz(int n) {
    for (int i = 1; i <= n; i++) {
      boolean dividedBy3 = false;
      boolean dividedBy5 = false;
      if (i % 3 == 0) {
        dividedBy3 = true;
      }
      if (i % 5 == 0) {
        dividedBy5 = true;
      }

      if (dividedBy3 && dividedBy5)
        System.out.println("FizzBuzz");
      else if (dividedBy3 && !dividedBy5)
        System.out.println("Fizz");
      else if (!dividedBy3 && dividedBy5)
        System.out.println("Buzz");
      else
        System.out.println(i);
    }
  }

  public static void main(String[] args) {
    fizzBuzz(15);
  }
}
