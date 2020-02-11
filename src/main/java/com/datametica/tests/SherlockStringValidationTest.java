package com.datametica.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SherlockStringValidationTest {

  public static void main(String[] args) {
    SherlockStringValidationTest sherlockStringValidationTest = new SherlockStringValidationTest();
    System.out.println(sherlockStringValidationTest.getSherlockSValidatedStringResult("aabbccddeefghi"));
  }

  public String getSherlockSValidatedStringResult(String input) {
    String result = "NO";
    int maxCharDeletionAllowedLimit = 1;
    Map<Character, Integer> characterCount = new HashMap<>();
    if (!isEmpty(input)) {
      for (char inputChar : input.toCharArray()) {
        int frequencyCount = 1;
        if (characterCount.containsKey(inputChar)) {
          frequencyCount = characterCount.get(inputChar);
          frequencyCount++;
        }
        characterCount.put(inputChar, frequencyCount);
      }
      System.out.println(characterCount);
      ArrayList<Integer> values = new ArrayList<>(characterCount.values());
      int countLimit = 0;
      boolean allEqual = true;
      for (Integer s : values) {
        if (!s.equals(values.get(0))) {
          countLimit++;
          allEqual = false;
        }
      }

      if (!allEqual) {
        if (countLimit == 1) {
          int maxFrequenciesOfCharCount = characterCount.values().stream().max(Comparator.naturalOrder()).get();
          int minFrequenciesOfCharCount = characterCount.values().stream().min(Comparator.naturalOrder()).get();
          if (maxFrequenciesOfCharCount - 1 == minFrequenciesOfCharCount) {
            result = "YES";
          }
        }
      } else
        result = "YES";
    }
    return result;
  }

  private boolean isEmpty(String input) {
    return input == null || input.trim().isEmpty();
  }
}
