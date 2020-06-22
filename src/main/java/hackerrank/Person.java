package hackerrank;

import java.util.Objects;

public class Person implements Comparable {
  String firstName;
  String lastName;
  int age;
  String country;

  public Person(String firstName, String lastName, int age, String country) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.country = country;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public String getCountry() {
    return country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;
    Person person = (Person) o;
    return getAge() == person.getAge() &&
      Objects.equals(getFirstName(), person.getFirstName()) &&
      Objects.equals(getLastName(), person.getLastName()) &&
      Objects.equals(getCountry(), person.getCountry());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getLastName(), getAge(), getCountry());
  }

  @Override
  public String toString() {
    return firstName + "|" + lastName + "|" + age + "|" + country;
  }

  @Override
  public int compareTo(Object o) {
    Person person = (Person) o;
    return 0;
  }
}
