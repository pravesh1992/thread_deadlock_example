package bny;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaleTest {
  public static void main(String[] args) {

//    3
//    chocolate
//      cheese
//    tomato
//    3
//    15
//    300.90
//    23.44
//    3
//    cheese
//      tomato
//    chocolate
//    3
//    300.90
//    23.44
//    10
//    ArrayList<String> products = new ArrayList<>();
//    products.add("rice");
//    products.add("sugar");
//    products.add("wheat");
//    products.add("cheese");
//    ArrayList<Float> productsPrice = new ArrayList<>();
//    productsPrice.add(16.89f);
//    productsPrice.add(56.92f);
//    productsPrice.add(20.89f);
//    productsPrice.add(345.99f);
//    ArrayList<String> productsSold = new ArrayList<>();
//    productsSold.add("rice");
//    productsSold.add("cheese");
//    ArrayList<Float> productsSoldPrice = new ArrayList<>();
//    productsSoldPrice.add(18.99f);
//    productsSoldPrice.add(400.89f);

    ArrayList<String> products = new ArrayList<>();
    products.add("chocolate");
    products.add("cheese");
    products.add("tomato");

    ArrayList<Float> productsPrice = new ArrayList<>();
    productsPrice.add(15f);
    productsPrice.add(300.90f);
    productsPrice.add(23.44f);

    ArrayList<String> productsSold = new ArrayList<>();
    productsSold.add("cheese");
    productsSold.add("tomato");
    productsSold.add("chocolate");
    ArrayList<Float> productsSoldPrice = new ArrayList<>();
    productsSoldPrice.add(300.90f);
    productsSoldPrice.add(23.44f);
    productsSoldPrice.add(10f);
    System.out.println("Result : " + priceCheck(products, productsPrice, productsSold, productsSoldPrice));
  }

  public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
    int result = 0;
    HashMap<String, Float> productVsPriceMap = new HashMap<>();
    int productSize = products.size() > productPrices.size() ? productPrices.size() : products.size();
    for (int i = 0; i < productSize; i++) {
      productVsPriceMap.put(products.get(i), productPrices.get(i));
    }

    HashMap<String, Float> productSoldVsPriceMap = new HashMap<>();
    int productSOldSize = productSold.size() > soldPrice.size() ? soldPrice.size() : productSold.size();
    for (int i = 0; i < productSOldSize; i++) {
      productSoldVsPriceMap.put(productSold.get(i), soldPrice.get(i));
    }

    for (Map.Entry<String, Float> entry : productVsPriceMap.entrySet()) {
      if (productSoldVsPriceMap.containsKey(entry.getKey())) {
        if (!entry.getValue().equals(productSoldVsPriceMap.get(entry.getKey())))
          result++;
      }
    }

    return result;
  }
}
