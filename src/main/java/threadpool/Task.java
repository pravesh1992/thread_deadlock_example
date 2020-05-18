package threadpool;

public class Task implements Runnable {

  private String name;

  Task(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    System.out.println("Executing task " + this.name + " by thread: " + Thread.currentThread().getName());
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}