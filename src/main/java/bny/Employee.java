package bny;

import java.util.Objects;

public class Employee {

  private int id = 0;

  public Employee(int id) {
    this.setId(id);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Employee)) return false;
    Employee employee = (Employee) o;
    return getId() == employee.getId();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id);
  }

  @Override
  public String toString() {
    return "Employee{" +
      "id=" + id +
      '}';
  }
}