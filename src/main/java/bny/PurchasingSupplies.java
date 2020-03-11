package bny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PurchasingSupplies {
  public static void main(String[] args) {
    maximumContainers(Arrays.asList("10 2 5", "12 4 4", "6 2 2"));
    //maximumContainers(Arrays.asList("8 4 2", "7 2 3"));
  }

  public static void maximumContainers(List<String> scenarios) {
    if (scenarios != null && !scenarios.isEmpty()) {
      List<SampleInput> sampleInputs = new ArrayList<>();
      for (String input : scenarios) {
        String[] inputArr = input.split(" ");
        SampleInput sampleInput = new SampleInput();
        sampleInput.setTotalUnitCurrency(Integer.parseInt(inputArr[0]));
        sampleInput.setPerUnit(Integer.parseInt(inputArr[1]));
        sampleInput.setTotalContainers(Integer.parseInt(inputArr[2]));
        sampleInputs.add(sampleInput);
      }
      result(sampleInputs);
    }
  }

  static void result(List<SampleInput> sampleInputs) {
    int remaining = 0;
    for (SampleInput sampleInput : sampleInputs) {
      int result = 0;
      if ((sampleInput.getPerUnit() * sampleInput.getTotalContainers()) == sampleInput.getTotalUnitCurrency()) {
        result = sampleInput.getTotalContainers() + 1;
      } else {
        if ((sampleInput.getPerUnit() * sampleInput.getTotalContainers()) < sampleInput.getTotalUnitCurrency()) {
          result = sampleInput.getTotalContainers() + (sampleInput.getTotalUnitCurrency() - (sampleInput.getPerUnit() * sampleInput.getTotalContainers())) + remaining;
          remaining = 0;
        } else {
          result = sampleInput.getTotalUnitCurrency() / sampleInput.getPerUnit();
          remaining = sampleInput.getTotalContainers() - result;
        }
      }
      System.out.println(result);
    }


  }

  static class SampleInput {
    int totalUnitCurrency;
    int perUnit;
    int totalContainers;

    public int getTotalUnitCurrency() {
      return totalUnitCurrency;
    }

    public void setTotalUnitCurrency(int totalUnitCurrency) {
      this.totalUnitCurrency = totalUnitCurrency;
    }

    public int getPerUnit() {
      return perUnit;
    }

    public void setPerUnit(int perUnit) {
      this.perUnit = perUnit;
    }

    public int getTotalContainers() {
      return totalContainers;
    }

    public void setTotalContainers(int totalContainers) {
      this.totalContainers = totalContainers;
    }
  }
}
