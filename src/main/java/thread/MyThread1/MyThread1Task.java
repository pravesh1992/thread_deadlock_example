package thread.MyThread1;

public class MyThread1Task implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + ": Staring of run method");
    for (int i = 0; i < 10; i++) {
//      try {
//        Thread.sleep(2000);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
      System.out.println(Thread.currentThread().getName() + ": counter : " + i);
    }
    System.out.println(Thread.currentThread().getName() + ": End of run method");
  }
}
