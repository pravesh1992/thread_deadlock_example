//package bny;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class SampleInputTest {
//
//  public static void main(String[] args) {
//    //maximumContainers(Arrays.asList("8 4 2", "7 2 3"));
//    maximumContainers(Arrays.asList("10 2 5", "12 4 4", "6 2 2"));
//  }
//
//  public static void maximumContainers(List<String> scenarios) {
//    if (scenarios != null && !scenarios.isEmpty()) {
//      List<SampleInput> sampleInputs = new ArrayList<>();
//      for (String input : scenarios) {
//        String[] inputArr = input.split(" ");
//        SampleInput sampleInput = new SampleInput();
//        sampleInput.setTotalUnitCurrency(Integer.parseInt(inputArr[0]));
//        sampleInput.setPerUnit(Integer.parseInt(inputArr[1]));
//        sampleInput.setTotalContainers(Integer.parseInt(inputArr[2]));
//        sampleInputs.add(sampleInput);
//      }
//      result(sampleInputs);
//    }
//  }
//
//
//  static int resultv2(SampleInput sampleInput) {
//    int result = 0;
//    result = sampleInput.getTotalUnitCurrency() / sampleInput.getPerUnit();
//    if (result == sampleInput.getTotalContainers()) {
//      result += 1;
//    }
//    return result;
//  }
//
//  static void result(List<SampleInput> sampleInputs) {
//    int remainingCount = 0;
//    for (SampleInput sampleInput : sampleInputs) {
//      int result = sampleInput.getTotalUnitCurrency() / sampleInput.getPerUnit();
//      if (result == sampleInput.getTotalContainers()) {
//        result += 1;
//        result += remainingCount;
//        remainingCount = 0;
//      } else if (result < sampleInput.getTotalContainers()) {
//        remainingCount = sampleInput.getTotalContainers() - result;
//      }
//      System.out.println(result);
//    }
//  }
//
//
//}
