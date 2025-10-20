
import java.time.Year;
import java.util.Scanner;

public class SearchMenu {

    private SearchCtrl ctrl;

    public SearchMenu(SearchCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Interest Group Management System ==");
        System.out.println("1. President Gender Search");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice:");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            display();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Scanner sPScanner = new Scanner(System.in);
                    System.out.print("Enter the Interest Groups's name> ");
                    String IGName = sPScanner.nextLine();
                    System.out.print("Enter the year> ");
                    int year = sPScanner.nextInt();
                    searchPresident(IGName, year);
                    break;
                case 2:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }
    public void searchPresident(String IGName, int year) {
        try {
            Student president = ctrl.searchPresident(IGName, year);
            String presName = president.getName();
            char presGender = president.getGender();
            switch (presGender) {
                case 'M' ->
                    System.out.println(String.format("The president %s is a %s.", presName, "gentleman"));
                case 'F' ->
                    System.out.println(String.format("The president %s is a %s.", presName, "lady"));
                default ->
                    throw new AssertionError();
            }
        } catch (NullPointerException e) {
            System.out.println("Invalid Interest Group/Year entered.");
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }
}
