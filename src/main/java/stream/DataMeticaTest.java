//package stream;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DataMeticaTest {
//  public static void main(String[] args) {
//    List<List<String>> matchingRecords = new ArrayList<>();
//    List<String> inner1 = new ArrayList<>();
//    inner1.add("1");
//    inner1.add("2");
//    inner1.add("2");
//    inner1.add("3");
//    inner1.add("4");
//    inner1.add("5");
//    inner1.add("5");
//    inner1.add("6");
//    matchingRecords.add(inner1);
//
//    List<ObjectEdge> edges = new ArrayList<>();
//    matchingRecords.forEach(item -> {
//      List<String> uniqueSouceVsTarget = new ArrayList<>();
//      String seperator = "#";
//      for (int i = 0; i < item.size() - 1; i++) {
//        StringBuffer value = new StringBuffer(item.get(i) + seperator + item.get(i + 1));
//        StringBuffer reverseValue = value.reverse();
//        if (!uniqueSouceVsTarget.contains(value.toString()) && !uniqueSouceVsTarget.contains(reverseValue.toString())) {
//          edges.add(new ObjectEdge(Long.valueOf(item.get(i)), Long.valueOf(item.get(i + 1))));
//          uniqueSouceVsTarget.add(value.toString());
//          uniqueSouceVsTarget.add(reverseValue.toString());
//        }
//      }
//    });
//
//    edges.forEach(item -> {
//      System.out.println("Unique Edge : " + item.getSource() + ":" + item.getTarget());
//    });
//  }
//}
