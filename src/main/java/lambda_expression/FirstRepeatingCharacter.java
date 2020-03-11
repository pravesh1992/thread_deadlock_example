package lambda_expression;

import java.util.HashMap;

public class FirstRepeatingCharacter {

  public static String firstRepeatingLetter(String input) {
    input = input.replaceAll(" ", "");
    String result = null;
    Character rptChar = null;
    //Will store each character and it's count
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < input.length(); i++) {
      Character chr = input.charAt(i);
      if (map.containsKey(chr)) {
        map.put(chr, map.get(chr) + 1);
      } else {
        map.put(chr, 1);
      }
    }
    //Iterate the string and return the character for which the count is > 1 in map
    for (int i = 0; i < input.length(); i++) {
      if (map.get(input.charAt(i)) > 1) {
        rptChar = input.charAt(i);
        break;
      }
    }
    return new String("" + rptChar);
  }


  public static Character getCharacter(String input) {
    //remove all the spaces
    input = input.replaceAll(" ", "");
    Character rptChar = null;
    //Will store each character and it's count
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < input.length(); i++) {
      Character chr = input.charAt(i);
      if (map.containsKey(chr)) {
        map.put(chr, map.get(chr) + 1);
      } else {
        map.put(chr, 1);
      }
    }
    //Iterate the string and return the character for which the count is > 1 in map
    for (int i = 0; i < input.length(); i++) {
      if (map.get(input.charAt(i)) > 1) {
        rptChar = input.charAt(i);
        break;
      }
    }
    return rptChar;
  }
}
