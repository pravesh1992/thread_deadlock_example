package multithreading;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<TaskResult> {

  int startRange;

  int endRange;

  public CallableTask(int startRange, int endRange) {
    this.startRange = startRange;
    this.endRange = endRange;
  }

  @Override
  public TaskResult call() throws Exception {
    int total = 0;
    for (int i = this.startRange; i <= endRange; i++) {
      total = i + total;
    }

    return new TaskResult(Thread.currentThread().getId(), total);
  }
}