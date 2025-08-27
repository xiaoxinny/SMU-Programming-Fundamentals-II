import java.util.ArrayList;
import java.util.Scanner;

public class CompanyTest {
    public static void checkEmployee(Company comp, int id) {
        Employee tempEmpHolder = comp.getEmployee(id);
        if (tempEmpHolder.getSpouse() != null) {
            System.out.printf("Name: %s, Salary: %.2f, Status: Married \n", tempEmpHolder.getName(), tempEmpHolder.getSalary());
            Spouse tempSpouse = tempEmpHolder.getSpouse();
            System.out.printf("Spouse's name: %s \n\n", tempSpouse.getName());
        } else {
            System.out.printf("Name: %s, Salary: %.2f, Status: Single \n\n", tempEmpHolder.getName(), tempEmpHolder.getSalary());
        }
    }

    public static void main(String[] args) {
        Company company = new Company("UMS");
        
        company.addEmployee(new Employee("John", 5, 2500, 'M', new Spouse("Kate", 37)));

        System.out.printf("Total salary (before): %.1f \n\n", company.getAllEmployeesSalary());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter gender: ");
        char gender = sc.nextLine().charAt(0);

        company.addEmployee(new Employee(name, id, salary, gender));

        System.out.printf("\nTotal salary (after): %.1f \n\n", company.getAllEmployeesSalary());

        // ArrayList<Integer> employees = new ArrayList<Integer>();
        // employees.add(4);
        // employees.add(5);
        // for(int i: employees) {
        //     Employee tempEmpHolder = company.getEmployee(i);
        //     if (tempEmpHolder.getSpouse() != null) {
        //         System.out.printf("Name: %s, Salary: %.2f, Status: Married", tempEmpHolder.getName(), tempEmpHolder.getSalary());
        //         Spouse tempSpouse = tempEmpHolder.getSpouse();
        //         System.out.printf("Spouse's name: %s", tempSpouse.getName());
        //     } else {
        //         System.out.printf("Name: %s, Salary: %.2f, Status: Single", tempEmpHolder.getName(), tempEmpHolder.getSalary());
        //     }
        // }
        checkEmployee(company, 4);
        checkEmployee(company, 5);
    }
}
