package threadpool;

public class CustomThreadPoolTest {
  public static void main(String[] args) throws InterruptedException {
    CustomThreadPool threadPool = new CustomThreadPool(10, 5);
    for (int i = 0; i < 10; i++) {
      threadPool.submitTask(new Task("Task" + i));
    }
  }
}