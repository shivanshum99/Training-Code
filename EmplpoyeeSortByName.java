//Sorting List of Employee object by Name

import java.util.*;
class Employee implements Comparable<Employee> {
 
 private int id;
 private String name;
 private int salary;
 
 public Employee(int id, String name, int salary) {
  super();
  this.id = id;
  this.name = name;
  this.salary = salary;
 }
 
 public int getId() {
  return id;
 }
 
 public void setId(int id) {
  this.id = id;
 }
 
 public String getName() {
  return name;
 }
 
 public void setName(String name) {
  this.name = name;
 }
 
 public int getSalary() {
  return salary;
 }
 
 public void setSalary(int salary) {
  this.salary = salary;
 }
 
 @Override
 public int compareTo(Employee o) {
   
  return this.getName().compareTo(o.getName());
}
  
 @Override
  public String toString() {
   return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
  }
 
}

public class EmplpoyeeSortByName {
 
 public static void main(String[] args) {
 
  List<Employee> emps = new ArrayList<>();
 
  emps.add(new Employee(3, "Shivanshu", 55000));
  emps.add(new Employee(1, "Prabhanshu", 57000));
  emps.add(new Employee(2, "Harshit", 56000));
 
  System.out.println("Before sorting list of employees : ");
  Iterator<Employee> it = emps.iterator();
  while (it.hasNext()) {
   System.out.println(it.next());
  }
  Collections.sort(emps);
 
  System.out.println("After sorting list of employees in natural order: ");
  it = emps.iterator();
  while (it.hasNext()) {
   System.out.println(it.next());
  }
}
}