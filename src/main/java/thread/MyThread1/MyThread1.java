package thread.MyThread1;

public class MyThread1 extends Thread {

  public MyThread1(String name) {
    super(name);
  }

//  @Override
//  public synchronized void start() {
//    System.out.println(Thread.currentThread().getName() + ": In Start method");
//  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + ": Staring of run method");
    for (int i = 0; i < 10; i++) {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + ": counter : " + i);
    }
    System.out.println(Thread.currentThread().getName() + ": End of run method");
  }
}
