public class Laptop extends Computer {
    private int batteryLife;
    private boolean tablet;

    public Laptop(String name, String company, int manufacturedYear, double price, String operatingSystem, double cpuSpeed, int batteryLife, boolean tablet){
        super(name, company, manufacturedYear, price, operatingSystem, cpuSpeed);
        this.batteryLife = batteryLife;
        this.tablet = tablet;
    }
    
    public int getBatteryLife() {
        return batteryLife;
    }
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
    public boolean isTablet() {
        return tablet;
    }
    public void setTablet(boolean tablet) {
        this.tablet = tablet;
    }
    @Override
    public String toString() {
        return "Laptop[" + super.toString() + ",BatteryLife=" + batteryLife + ",Tablet=" + tablet + "]";
    }
}
