package threadpool;

import java.util.concurrent.LinkedBlockingQueue;

public class TaskExecutor implements Runnable {

  private LinkedBlockingQueue<Task> tasks;

  public TaskExecutor(LinkedBlockingQueue<Task> tasks) {
    this.tasks = tasks;
  }

  @Override
  public void run() {
    while (true) {
      Task task = tasks.poll();
      if (task != null) {
        task.run();
      }
    }
  }
}