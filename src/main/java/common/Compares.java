package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Compares {


  public static int shortestSubstring(String s) {
    if (s != null && !s.isEmpty()) {
      char[] charArray = s.toCharArray();
      LinkedHashMap<String, Integer> uniqueCharaCoutMap = new LinkedHashMap<>();
      for (char character : charArray)
        if (!uniqueCharaCoutMap.containsKey(character + "")) {
          uniqueCharaCoutMap.put(character + "", 1);
        } else {
          int count = uniqueCharaCoutMap.get(character + "");
          count++;
          uniqueCharaCoutMap.put(character + "", count);
        }


      ArrayList<Integer> countList = new ArrayList<>();
      for (Map.Entry<String, Integer> entry : uniqueCharaCoutMap.entrySet()) {
        countList.add(entry.getValue());
      }
      Collections.sort(countList);
      return countList.get(0);
    } else
      return 0;


  }


  public static void main(String[] args) {
    String test = "abbcabcd";
    System.out.println("Result" + shortestSubstring(test));
  }
}
