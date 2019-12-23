package multithreading;

public class FunctionInterfaceThread {
  public static void main(String[] args) {
    Runnable runnable = () -> {
      System.out.println("In run method of runnable interface");
    };
    Thread thread1 = new Thread(runnable);
    thread1.start();
  }
}
