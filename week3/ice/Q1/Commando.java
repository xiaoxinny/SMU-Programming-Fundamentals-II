package ice.Q1;

public class Commando extends Soldier {
    private double vocationAllowance;

    public Commando(String name, double baseAllowance, double vocationAllowance) {
        super(name, baseAllowance);
        this.vocationAllowance = vocationAllowance;
    }

    public double getGrossAllowance() {
        return getBaseAllowance() + vocationAllowance;
    }

    public String toString() {
        return String.format("Commando{Soldier=%s, vocationAllowance=%.2f}", super.toString(), vocationAllowance);
    }
}