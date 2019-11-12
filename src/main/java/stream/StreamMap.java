package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(27, "Pravesh Lodwal"));
    employees.add(new Employee(30, "Praveen Gupta"));
    employees.add(new Employee(24, "Abhinash Verma"));
    employees.add(new Employee(22, "Naveen Lodwal"));
    // Normal foreach

    System.out.println("List Foreach");
    employees.forEach(employee -> {
      System.out.println(employee);
    });
    System.out.println("List Stream Foreach");
    employees.stream().forEach(employee -> {
      System.out.println(employee);
    });
    System.out.println("List Stream Filter");
    employees.stream().filter(employee -> employee.getAge() == 30).forEach(employee -> {
      System.out.println(employee);
    });
    System.out.println("List Stream All Match" + employees.stream().allMatch(employee -> employee.getName().contains("Lodwal")));

    List<String> employeeNames = new ArrayList<>();
    System.out.println("List Stream Map");
    System.out.println(employees.stream().map(employee -> employee.getName()).collect(Collectors.toList()));
    System.out.println("List Stream Sorted");

    System.out.println(employees.stream().sorted(new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return o2.getAge()>o1.getAge()?0:1;
      }
    }).map(employee -> employee.getName()).collect(Collectors.toList()));

  }
}
