package exercise1;

public class Computer extends ElectronicProduct{
    private String operatingSystem;
    private double cpuSpeed;

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
}
