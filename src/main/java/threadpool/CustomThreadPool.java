package threadpool;

import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool {
  private LinkedBlockingQueue<Task> tasks;
  private int maxThreadCount;

  public CustomThreadPool(int maxQueueCapacity, int maxThreadCount) {
    this.tasks = new LinkedBlockingQueue<>(maxQueueCapacity);
    this.maxThreadCount = maxThreadCount;
    for (int i = 0; i < maxThreadCount; i++) {
      TaskExecutor taskExecutor = new TaskExecutor(this.tasks);
      new Thread(taskExecutor, "Thread:" + i).start();
    }
  }

  public void submitTask(Task task) throws InterruptedException {
    this.tasks.put(task);
  }
}