package oops;

public class TestY extends TestX {

  private void display() {
    System.out.println("Display: TestY");
  }

  public void display(int a, int b, int c) {
    System.out.println("Display: Int,Int,Int");
  }

  static void displayStatic() {
    System.out.println("Display Static: TestY");
  }

  public static void main(String[] args) {
    TestY testY = new TestY();
    testY.display();
    TestY testY1 = null;
    testY1.displayStatic();
    //testY1.display();
    testY1.display(1, 2);
  }
}