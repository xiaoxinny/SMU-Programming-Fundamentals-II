
import java.util.Scanner;

// test class for the bank portal application

public class PortalApp {
    public static void main(String[] args) {
        PortalController ctrl = new PortalController();
        PortalMenu menu = new PortalMenu(ctrl);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bank Portal");
        System.out.print("Enter your account number > ");
        String fromAccNum = sc.nextLine();
        System.out.print("Enter account to transfer to > ");
        String toAccNum = sc.nextLine();
        System.out.print("Enter amount to transfer > ");
        int amount = sc.nextInt();
        sc.nextLine();
        menu.processTransfer(fromAccNum, toAccNum, amount);
    }
}