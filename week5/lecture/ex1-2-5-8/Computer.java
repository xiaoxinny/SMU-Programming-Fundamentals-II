public class Computer extends ElectronicProduct{
    private String operatingSystem;
    private double cpuSpeed;

    public Computer(String name, String company, int manufacturedYear, double price, String operatingSystem, double cpuSpeed) {
        super(name, company, manufacturedYear, price);
        this.operatingSystem = operatingSystem;
        this.cpuSpeed = cpuSpeed;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public double getCpuSpeed() {
        return cpuSpeed;
    }
    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }
    @Override
    public String toString() {
        return "Computer[" + super.toString() + ",OperatingSystem=" + operatingSystem + ",CpuSpeed=" + cpuSpeed + "]";
    }
}
