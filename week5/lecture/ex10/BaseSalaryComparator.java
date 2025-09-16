import java.util.Comparator;

public class BaseSalaryComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2) {
        return e1.getBaseSalary().compareTo(e2.getBaseSalary());
    }
}
