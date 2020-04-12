package object;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Cloneable, Serializable {
  String employeeId;
  String firstName;
  String lastName;
  Integer age;
  Long mobileNo;

  public Employee() {
  }

  public Employee(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Long getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(Long mobileNo) {
    this.mobileNo = mobileNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee)) return false;
    Employee employee = (Employee) o;
    return Objects.equals(getEmployeeId(), employee.getEmployeeId()) &&
      Objects.equals(getFirstName(), employee.getFirstName()) &&
      Objects.equals(getLastName(), employee.getLastName()) &&
      Objects.equals(getAge(), employee.getAge()) &&
      Objects.equals(getMobileNo(), employee.getMobileNo());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getEmployeeId(), getFirstName(), getLastName(), getAge(), getMobileNo());
  }

  @Override
  public String toString() {
    return "Employee{" +
      "employeeId='" + employeeId + '\'' +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", age=" + age +
      ", mobileNo=" + mobileNo +
      '}';
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}