package tracelink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test1Amazon {

  public static void main(String[] args) {
    Test1Amazon test1Amazon = new Test1Amazon();
    List<String> topCompetitors = Arrays.asList("newshop", "shopnow", "afshion", "fashionbeats", "mymarket", "tcelluar");
    List<String> reviews = Arrays.asList("newshop is providing good services in the city. everyone should use newshop",
      "best services by newshop", "fashionbeats has best services", "i am proud of fashionbeats",
      "mymarket has awseome services", "Thanks for Newshop");
    System.out.println(test1Amazon.topNCompetitors(6, 2, topCompetitors, 6, reviews));
  }

  private static int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
    boolean result = o1.getValue().equals(o2.getValue());
    if (result)
      return o1.getKey().compareTo(o2.getKey());
    else
      return o1.getValue().compareTo(o2.getValue());
  }


  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public ArrayList<String> topNCompetitors(int numCompetitors,
                                           int topNCompetitors,
                                           List<String> competitors,
                                           int numReviews,
                                           List<String> reviews) {
    if (reviews != null && !reviews.isEmpty()) {
      Map<String, Integer> wordVsCounts = new HashMap<>(30);
      for (String reviewContent : reviews) {
        String[] reviewInsideName = reviewContent.split(" ");
        for (String reviewName : reviewInsideName) {
          reviewName = reviewName.toUpperCase();
          int count = 1;
          if (wordVsCounts.containsKey(reviewName)) {
            count = wordVsCounts.get(reviewName);
            count++;
          }
          wordVsCounts.put(reviewName, count);
        }
      }
      HashMap<String, Integer> competitorVsCount = new HashMap<>();
      for (String competitor : competitors) {
        competitor = competitor.toUpperCase();
        competitorVsCount.put(competitor, wordVsCounts.getOrDefault(competitor, 0));
      }

      // Create a list from elements of HashMap
      List<Map.Entry<String, Integer>> list = new LinkedList<>(competitorVsCount.entrySet());
      Collections.sort(list, Collections.reverseOrder(Test1Amazon::compare));
      ArrayList<String> competitor = new ArrayList<>();
      for (int i = 0; i < topNCompetitors; i++) {
        if (i < list.size())
          competitor.add(list.get(i).getKey());
      }

      return competitor;
    }

    return new ArrayList<>(0);
  }
  // METHOD SIGNATURE ENDS
}
