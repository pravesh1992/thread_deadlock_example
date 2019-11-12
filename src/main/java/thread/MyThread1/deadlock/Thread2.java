package thread.MyThread1.deadlock;

public class Thread2 extends Thread {

  private String resource1;

  private String resource2;

  public Thread2(String name, String resource1, String resource2) {
    super(name);
    this.resource1 = resource1;
    this.resource2 = resource2;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " run method started");
    synchronized (resource2) {
      System.out.println(Thread.currentThread().getName() + " acquired lock on " + resource2);
      try {
        Thread.sleep(10000);
        System.out.println(Thread.currentThread().getName() + " waiting for lock on " + resource1);
        synchronized (resource1) {
          System.out.println(Thread.currentThread().getName() + " acquired lock on " + resource1);
        }
      } catch (Exception e) {
      }
    }
    System.out.println(Thread.currentThread().getName() + " run method ended");
  }
}
