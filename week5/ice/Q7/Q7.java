/*
 * Zhang Zhiyuan created on 15 Sep 2025
 */

import java.util.*;
class Employee implements Comparable<Employee> {
    private int employeeId;
    private String name;
    private int age;
    private double salary;
    // Constructor
    public Employee(int employeeId, String name, int age, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    

    /*
     * Write the method compareTo
     */
    @Override
    public int compareTo(Employee other) {
        if (Double.compare(salary, other.salary) == 0 && age == other.age) {
            return Integer.compare(employeeId, other.employeeId);
        } else if (Double.compare(salary, other.salary) == 0) {
            return Integer.compare(other.age, age);
        } else {
            return Double.compare(salary, other.salary);
        }
    }  
    
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

// Do not modify the following codes
public class Q7 {   
    public static List<Employee> sortEmployees(List<Employee> employees) {
        Collections.sort(employees); // Sort using Comparable implementation
        return employees;
    } 
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", 30, 5000.0);
        Employee emp2 = new Employee(2, "Bob", 25, 5000.0);
        Employee emp3 = new Employee(3, "Charlie", 30, 4000.0);
        Employee emp4 = new Employee(4, "Tom", 36, 2000.0);
        Employee emp5 = new Employee(5, "Jack", 30, 2000.0);
        Employee emp6 = new Employee(6, "Diana", 28, 6000.0);
        Employee emp7 = new Employee(7, "Adam", 28, 6000.0);
        List<Employee> employees = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);

        // expected
        System.out.println("Expected : ");
        List<Employee> employee_expected = Arrays.asList(emp4,emp5,emp3,emp1,emp2,emp6,emp7);
        employee_expected.forEach(System.out::println);

        // actual
        System.out.println("Actual   : ");
        List<Employee> sortedEmployees = sortEmployees(employees);
        sortedEmployees.forEach(System.out::println);

        if (sortedEmployees.equals(employee_expected)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}