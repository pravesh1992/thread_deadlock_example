package com.datametica.tests;

public class AlternatingCharacters {
  public static void main(String[] args) {
    AlternatingCharacters alternatingCharacters = new AlternatingCharacters();
    System.out.println("AlternatingCharacters for AABAAB:" + alternatingCharacters.alternatingCharacters("AABAAB"));
    System.out.println("AlternatingCharacters for AAAA:" + alternatingCharacters.alternatingCharacters("AAAA"));
    System.out.println("AlternatingCharacters for BBBBB:" + alternatingCharacters.alternatingCharacters("BBBBB"));
    System.out.println("AlternatingCharacters for ABABABAB:" + alternatingCharacters.alternatingCharacters("ABABABAB"));
    System.out.println("AlternatingCharacters for BABABA:" + alternatingCharacters.alternatingCharacters("BABABA"));
    System.out.println("AlternatingCharacters for AAABBB:" + alternatingCharacters.alternatingCharacters("AAABBB"));
  }

  public int alternatingCharacters(String input) {
    int alternativeCharactersCount = 0;
    if (!isEmpty(input)) {
      char[] inputCharArray = input.toCharArray();
      char previousChar = Character.MAX_VALUE;
      for (char inputChar : inputCharArray) {
        if (inputChar == previousChar) {
          alternativeCharactersCount++;
        }
        previousChar = inputChar;
      }
    }
    return alternativeCharactersCount;
  }

  private boolean isEmpty(String input) {
    return input == null || input.trim().isEmpty();
  }
}
