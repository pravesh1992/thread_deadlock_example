package lambda_expression;

import java.io.Serializable;
import java.util.Scanner;

public enum EmpCode {
  ASSOCIATE(10001),
  SENIOR_ASSOCIATE(10002),
  MANAGER(10003),
  SENIOR_MANAGER(10004);

  private int code;

  EmpCode(int code) {
    this.code = code;
  }

  public static EmpCode getEnum(int code) {
    EmpCode empCodeResult = null;
    for (EmpCode empCode : EmpCode.values()) {
      if (empCode.code == code)
        empCodeResult = empCode;
    }
    if (empCodeResult != null)
      return empCodeResult;
    else {
      throw new TestException("Exception");
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int codeFromDB = scan.nextInt();
    try {
      System.out.println(EmpCode.getEnum(codeFromDB));
    } catch (IllegalArgumentException e) {
      System.out.println(e.toString());
    }
    scan.close();
  }

  static class TestException extends IllegalArgumentException implements Serializable {

    public TestException(String message) {
      super(message);
    }

    @Override
    public String toString() {
      return this.getMessage();
    }
  }
}

