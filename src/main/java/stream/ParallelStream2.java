package stream;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelStream2 {

  private void run() throws InterruptedException {
    ExecutorService es = Executors.newCachedThreadPool();
    // Simulating multiple threads in the system
    // if one of them is executing a long-running task.
    // Some of the other threads/tasks are waiting
    // for it to finish  es.execute(() -> countPrimes(MAX, 1000));
    // incorrect task  es.execute(() -> countPrimes(MAX, 0));
    // es.execute(() -> countPrimes(MAX, 0));
    // es.execute(() -> countPrimes(MAX, 0));
    // es.execute(() -> countPrimes(MAX, 0));
    // es.execute(() -> countPrimes(MAX, 0));
    // es.shutdown();
    // es.awaitTermination(60, TimeUnit.SECONDS);}
    // private void countPrimes(int max, int delay)
    // {
    // System.out.println(     range(1, max).parallel()        .filter(this::isPrime).peek(i -> sleep(delay)).count()  );
    // }
  }
}
