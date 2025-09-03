package exercise3;

public class Manager extends Employee {
    private double allowance;

    public Manager(String name, double baseSalary, double allowance) {
        super(name, baseSalary);
        this.allowance = allowance;
    }

    public double getGrossSalary() {
        return getBaseSalary() + allowance;
    }

    public String toString() {
        return ""; 
    }
}
