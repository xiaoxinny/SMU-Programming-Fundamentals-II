public class Employee implements Comparable<Employee>{
	private String name;
	private Double baseSalary;
	
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
	public int compareTo(Employee other) {
		return this.baseSalary.compareTo(other.baseSalary);
	}
	
	public String toString() {
		return "name=" + name + ",baseSalary=" + baseSalary;
	}
}