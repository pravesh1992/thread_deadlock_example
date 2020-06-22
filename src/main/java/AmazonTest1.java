import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AmazonTest1 {
  public static void main(String[] args) {
    //String helpText = "Rose is flower red rose are flower";
    //List<String> worksToExclude = Arrays.asList("is", "are", "");
    List<String> worksToExclude = Arrays.asList("and", "he", "the", "to", "is");
    String helpText = "Jack and Jill went to market to buy bread and cheese . Cheese is jack's and jill's favorite food";
    AmazonTest1 amazonTest1 = new AmazonTest1();
    System.out.println(amazonTest1.retrieveMostFrequentlyUsedWords(helpText, worksToExclude));
  }

  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  List<String> retrieveMostFrequentlyUsedWords(String helpText, List<String> wordsToExclude) {
    if (helpText != null && !helpText.isEmpty()) {
      Map<String, Integer> stringToCount = stringToCount(helpText);
      // Create a list from elements of HashMap
      List<Map.Entry<String, Integer>> list = new LinkedList<>(stringToCount.entrySet());
      // Sort the list
      Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
      Map.Entry<String, Integer> entryWithMaxItems = list.get(list.size() - 1);
      List<String> itemsWithoutExcluded = list.stream().filter(item -> item.getValue().equals(entryWithMaxItems.getValue())).map(Map.Entry::getKey).collect(Collectors.toList());
      itemsWithoutExcluded.removeAll(wordsToExclude);
      return itemsWithoutExcluded;
    }
    return new ArrayList<>();
  }


  private Map<String, Integer> stringToCount(String helpText) {
    String[] items = helpText.split(" ");
    Map<String, Integer> stringToCount = new HashMap<>(items.length);
    for (String text : items) {
      if (text.contains("'s")) {
        String[] newSubString = text.split("'");
        for (String newText : newSubString) {
          Integer counter = 1;
          if (stringToCount.containsKey(newText.toLowerCase())) {
            counter = stringToCount.get(newText.toLowerCase());
            counter++;
          }
          stringToCount.put(newText.toLowerCase(), counter);
        }

      } else {
        Integer counter = 1;
        if (stringToCount.containsKey(text.toLowerCase())) {
          counter = stringToCount.get(text.toLowerCase());
          counter++;
        }
        stringToCount.put(text.toLowerCase(), counter);
      }
    }

    return stringToCount;
  }
}
