import java.util.Scanner;

public class CashRegisterTest {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of the first item: $");
        double price1 = sc.nextDouble();
        cashRegister.registerPurchase(price1);
        sc.nextLine();

        System.out.print("Enter the price of the second item: $");
        double price2 = sc.nextDouble();
        cashRegister.registerPurchase(price2);
        sc.nextLine();

        System.out.printf("Enter dollars received from customer: ");
        int dollars = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter cents received from customer: ");
        int cents = sc.nextInt();
        sc.nextLine();

        cashRegister.makePayment(dollars, cents);

        System.out.printf("Total cost of purchase: $%.2f\n", cashRegister.getPurchaseAmt());
        System.out.printf("Change due: %.2f", cashRegister.giveChange());

        sc.close();
    }
}
