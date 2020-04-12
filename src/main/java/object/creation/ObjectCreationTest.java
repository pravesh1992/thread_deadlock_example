package object.creation;

import object.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class ObjectCreationTest {
  public static void main(String[] args) {
    try {
      System.out.println("First Way of Object Creation: New:" + new Employee());
      System.out.println("Second Way of object creation: newInstance() method of Class class: Type1:" + Class.forName("object.Employee").newInstance());
      System.out.println("Second Way of object creation: newInstance() method of Class class: Type2:" + Employee.class.newInstance());
      Constructor<Employee> constructor = Employee.class.getConstructor();
      System.out.println("Third way of object creation: newInstance of Constructor class:Type1(Default constructor:" + constructor.newInstance());
      Constructor<Employee> employeeConstructorEmployeeId = Employee.class.getConstructor(String.class);
      System.out.println("Third way of object creation: newInstance of Constructor class:Type2(Parameterized constructor:" + employeeConstructorEmployeeId.newInstance("DME0656"));
      Employee employeeClone = new Employee("TEST");
      System.out.println("Fourth way of object creation: Clone :" + employeeClone.clone());
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("data.obj")));
      objectOutputStream.writeObject(new Employee("Serialized Object"));
      ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("data.obj")));
      System.out.println("Fifth way of object creation: Serialization & Deserialization :" + in.readObject());
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}