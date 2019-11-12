package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelExample3b {
  public static void main(String[] args) {
    System.out.println("Parallel Stream...");
    List<Integer> integers = new ArrayList<>();
    for (int i = 0; i < 10; i++)
      integers.add(i);

    Stream<Integer> parallelStreams = integers.parallelStream();
    System.out.println("Total Stream Count : "+parallelStreams.count());
    integers.parallelStream().forEach(x -> {
      System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
    });
  }
}