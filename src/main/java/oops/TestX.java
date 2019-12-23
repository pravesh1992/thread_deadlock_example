package oops;

public class TestX {

  private void display() {
    System.out.println("Display: TestX");
  }

  public void display(int a) {
    System.out.println("Display: Int");
  }

  public void display(int a, int b) {
    System.out.println("Display: Int,Int");
  }

  static void displayStatic() {
    System.out.println("Display Static: TestX");
  }

  public static void main(String[] args) {
    TestX testX = new TestY();
    testX.display();
  }
}