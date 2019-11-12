/*
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Test {
  static List<String> units;

  static {
    units = new ArrayList<>();
    units.add("Mb");
    units.add("Gb");
    units.add("Tb");
    units.add("Pb");
  }

  static String formatTotalTableSize(double totalTableSize) {
    String formattedTotalTableSize = "0 Mb";
    if (totalTableSize > 0) {
      int digitGroups = (int) (Math.log10(totalTableSize) / Math.log10(1024));
      if (digitGroups < 0)
        digitGroups = 0;
      return new DecimalFormat("#,##0.#").format(totalTableSize / Math.pow(1024, digitGroups)) + " " + units.
        get(digitGroups);
    }

    return formattedTotalTableSize;
  }

  public static void main(String[] args) {


//    double totalTableSize = 0.13;
//    String formattedTotalTableSize = formatTotalTableSize(totalTableSize);
//    System.out.println("TotalTableSize:" + totalTableSize + ", Formatted TotalTableSize:" + formattedTotalTableSize);

    double convertedDouble =
    double number = 0.11332125048483571;
    System.out.println(number);
    System.out.println(Double.toString(number));

    Double doubleConverted = Double.parseDouble(Double.toString(number));
    System.out.println(doubleConverted);
  }
}*/
