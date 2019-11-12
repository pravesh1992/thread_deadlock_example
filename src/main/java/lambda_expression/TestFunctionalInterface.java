package lambda_expression;

import java.util.ArrayList;
import java.util.List;

public class TestFunctionalInterface {
  public static void main(String[] args) {
    TestInterface testInterface = (String message) -> {
      return message;
    };

    String message = testInterface.sayHello("123");

    List<String> names = new ArrayList<>();
    names.add("Pravesh");
    names.add("Mohan");
    names.add("Rajesh");
    names.add("Naveen");

    names.stream().forEach(item->{
      System.out.println(item);
    });
  }
}
