package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExecutorFrameworkTest {
  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newFixedThreadPool(5);
    int startRange = 10;
    int endRange = 20;
    Future[] futuresOfCallableTaskResults = new Future[5];
    for (int i = 0; i < 5; i++) {
      futuresOfCallableTaskResults[i] = executorService.submit(new CallableTask(startRange, endRange));
      startRange = startRange + 10;
      endRange = endRange + 10;
    }

    for (Future future : futuresOfCallableTaskResults) {
      TaskResult taskResult = (TaskResult) future.get();
      System.out.println("Total Count:" + taskResult.getTotalCount() + ", ThreadId:" + taskResult.getThreadId());
    }


    executorService.shutdown();
  }
}
