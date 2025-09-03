package ice.Q1;

public class SoldierTest {
    public static void main(String[] args) {
        Commando c = new Commando("Peter", 5000, 200);
        Soldier s = new Soldier("John", 3000);
        Officer o = new Officer("Lily", 4500, "CPT", 800, 150);
        System.out.println(c);
        System.out.println(s);
        System.out.println(o);
        System.out.println("Commando's base allowance : " + c.getBaseAllowance());
        System.out.println("Commando's gross allowance : " + c.getGrossAllowance());
        System.out.println("Soldier's base allowance : " + s.getBaseAllowance());
        System.out.println("Soldier's gross allowance : " + s.getGrossAllowance());
        System.out.println("Officer's base allowance : " + o.getBaseAllowance());
        System.out.println("Officer's Bonus : " + o.getPerformanceBonus());
        System.out.println("Officer's gross allowance : " + o.getGrossAllowance());
    }
}
