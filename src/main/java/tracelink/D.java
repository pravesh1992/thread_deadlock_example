package tracelink;

import common.C;

public class D extends C {

  public float m(float x1, float x2) {
    return 0;
  }

  public static void main(String[] args) {
    D d = new D();
    System.out.println(d);
    Integer a = null;
    int b = a;
    System.out.println(b);
  }


//  @Override
//  float m(float x, float y) {
//    return 0;
//  }

//  @Override
//  public int m(int x, int y) throws IOException {
//    return 0;
//  }
}