import java.util.Scanner;

public class TestPartAndQuantityEntry {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter part number> ");
            int partNumber = sc.nextInt();

            System.out.print("Enter quantity> ");
            int quantity = sc.nextInt();

            new PartAndQuantityEntry().enterPartAndQuantity(partNumber, quantity);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            TestPartAndQuantityEntry.main(args);
        }
    }
}