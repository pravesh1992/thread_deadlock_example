package bny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReformatString {
  private static Map<String, String> monthVsValue = new HashMap<>();
  private static Map<String, String> dayVsValue = new HashMap<>();
  private static List<String> years = new ArrayList<>();

  static {
    monthVsValue.put("Jan", "01");
    monthVsValue.put("Feb", "02");
    monthVsValue.put("Mar", "03");
    monthVsValue.put("Apr", "04");
    monthVsValue.put("May", "05");
    monthVsValue.put("Jun", "06");
    monthVsValue.put("Jul", "07");
    monthVsValue.put("Aug", "08");
    monthVsValue.put("Sep", "09");
    monthVsValue.put("Oct", "10");
    monthVsValue.put("Nov", "11");
    monthVsValue.put("Dec", "12");

    dayVsValue.put("1st", "01");
    dayVsValue.put("2nd", "02");
    dayVsValue.put("3rd", "03");
    dayVsValue.put("4th", "04");
    dayVsValue.put("5th", "05");
    dayVsValue.put("6th", "06");
    dayVsValue.put("7th", "07");
    dayVsValue.put("8th", "08");
    dayVsValue.put("9th", "09");
    dayVsValue.put("10th", "10");
    dayVsValue.put("11th", "11");
    dayVsValue.put("12th", "12");
    dayVsValue.put("13th", "13");
    dayVsValue.put("14th", "14");
    dayVsValue.put("15th", "15");
    dayVsValue.put("16th", "16");
    dayVsValue.put("17th", "17");
    dayVsValue.put("18th", "18");
    dayVsValue.put("19th", "19");

    //21st	22nd	23rd	24th	25th	26th	27th	28th	29th	30th
    dayVsValue.put("20th", "20");
    dayVsValue.put("21st", "21");
    dayVsValue.put("22nd", "22");
    dayVsValue.put("23rd", "23");
    dayVsValue.put("24th", "24");
    dayVsValue.put("25th", "25");
    dayVsValue.put("26th", "26");
    dayVsValue.put("27th", "27");
    dayVsValue.put("28th", "28");
    dayVsValue.put("29th", "29");
    dayVsValue.put("30th", "30");
    dayVsValue.put("31st", "31");
  }

  public static List<String> reformatDate(List<String> dates) {
    List<String> convertedString = new ArrayList<>();
    if (dates != null && !dates.isEmpty()) {
      for (String date : dates) {
        String[] dateArr = date.split(" ");
        convertedString.add(dateArr[2] + "-" + monthVsValue.get(dateArr[1]) + "-" + dayVsValue.get(dateArr[0]));
      }
    }
    return convertedString;
  }

  public static void main(String[] args) {
    System.out.println(reformatDate(Arrays.asList("1st Mar 1984","2nd Feb 2013","4th Apr 1900")));
  }

}
