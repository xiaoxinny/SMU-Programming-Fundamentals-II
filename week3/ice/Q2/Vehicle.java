package ice.Q2;

public class Vehicle {
    private int numWheels;
    private double distancePerLiter;
    
    public Vehicle(int numWheels, double distancePerLiter) {
        this.numWheels = numWheels;
        this.distancePerLiter = distancePerLiter;
    }

    public String toString() {
        return String.format("Vehicle[numWheels<%d>, distancePerLiter=<%.2f>]", numWheels, distancePerLiter);
    }
}
