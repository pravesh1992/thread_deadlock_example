package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonUtils {

  public static void sortPersons(List<Person> persons, String[] sortBy) {
    List<String> supportedSortingKeys = Arrays.asList("firstName".toLowerCase(), "lastName".toLowerCase(), "age".toLowerCase(), "country".toLowerCase());
    List<String> sortedKeys = new ArrayList<>();
    for (String sortByKey : sortBy) {
      if (supportedSortingKeys.contains(sortByKey.toLowerCase())) {
        sortedKeys.add(sortByKey);
      }
    }


    Collections.sort(persons, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {


        return 0;
      }
    });
  }


}
