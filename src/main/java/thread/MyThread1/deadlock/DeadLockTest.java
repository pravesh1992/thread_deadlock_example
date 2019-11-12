package thread.MyThread1.deadlock;

public class DeadLockTest {
  public static void main(String[] args) throws InterruptedException {
    String resource1 = "Resource1";
    String resource2 = "Resource2";
    Thread1 thread1 = new Thread1("Thread1", resource1, resource2);
    thread1.start();
    Thread2 thread2 = new Thread2("Thread2", resource1, resource2);
    thread2.start();
    Thread.sleep(120000);
  }
}