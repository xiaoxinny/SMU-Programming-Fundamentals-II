import java.util.ArrayList;

public class EmployeeTest {

  //Implement the method here
  public static double calManagerAvgGrossSalary(ArrayList<Employee> empList) {
    int totalSalary = 0;
    int managerCount = 0;

    for (Employee emp: empList) {
      if (emp instanceof Manager) {
        Manager manager = (Manager) emp;
        totalSalary += manager.getGrossSalary();
        managerCount++;
      }
    }

    return totalSalary / managerCount;
  }

  public static void main(String[] args) {
    ArrayList<Employee> empList = new ArrayList<Employee>();
    empList.add(new Manager("Albert", 5000, 2000));
    empList.add(new Manager("Benny", 7000, 1500));
    empList.add(new Manager("Charles", 9000, 1000));
    empList.add(new Employee("Danny", 1500));
    empList.add(new Employee("Edward", 4000));
    empList.add(new Employee("Fred", 3500));
    empList.add(new Employee("George", 3500));
    System.out.println(calManagerAvgGrossSalary(empList));
  }
}
