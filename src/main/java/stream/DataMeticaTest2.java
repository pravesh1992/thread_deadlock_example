package stream;//package stream;

import java.util.ArrayList;
import java.util.List;

public class DataMeticaTest2 {
  public static void main(String[] args) {
    List<List<String>> matchingRecords = new ArrayList<>();
    List<String> inner1 = new ArrayList<>();
    inner1.add("1");
    inner1.add("2");
    inner1.add("2");
    inner1.add("3");
    inner1.add("4");
    inner1.add("3");
    inner1.add("4");
    inner1.add("5");
    inner1.add("5");
    inner1.add("6");
    inner1.add("5");
    inner1.add("6");
    inner1.add("5");
    inner1.add("5");
    matchingRecords.add(inner1);

    List<ObjectEdge> edges = new ArrayList<>();
    matchingRecords.forEach(item -> {
      for (int i = 0; i < item.size() - 1; i++) {
        if (!item.get(i).equals(item.get(i + 1))) {
          ObjectEdge objectEdge = new ObjectEdge(Long.valueOf(item.get(i)), Long.valueOf(item.get(i + 1)));
          if (!edges.contains(objectEdge))
            edges.add(objectEdge);
        }
      }
    });

    edges.forEach(item -> {
      System.out.println("Unique Edge : " + item.getSource() + ":" + item.getTarget());
    });
  }
}
