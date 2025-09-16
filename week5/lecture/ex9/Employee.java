public class Employee{
	private String name;
	private double baseSalary;
	
	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	// Implement the method here
	
	public String toString() {
		return "name=" + name + ",baseSalary=" + baseSalary;
	}
}