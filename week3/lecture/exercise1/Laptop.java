package exercise1;

public class Laptop extends Computer {
    private int batteryLife;
    private boolean tablet;
    
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
}
