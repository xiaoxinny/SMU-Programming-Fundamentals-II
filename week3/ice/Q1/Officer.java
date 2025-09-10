package ice.Q1;

public class Officer extends Soldier {
    private String rank;
    private double rankAllowance;
    private double performanceBonus;

    public Officer(String name, double baseAllowance, String rank, double rankAllowance, double performanceBonus) {
        super(name, baseAllowance);
        this.rank = rank;
        this.rankAllowance = rankAllowance;
        this.performanceBonus = performanceBonus;
    }

    public String getRank() {
        return rank;
    }

    public double getRankAllowance() {
        return rankAllowance;
    }

    public double getPerformanceBonus() {
        return performanceBonus;
    }

    public double getGrossAllowance() {
        return getBaseAllowance() + rankAllowance + performanceBonus;
    }

    public String toString() {
        return String.format("Officer{Soldier=%s, rank='%s'}", super.toString(), rank);
    }
}
