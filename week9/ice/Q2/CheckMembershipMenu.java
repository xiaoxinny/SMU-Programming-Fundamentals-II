import java.time.Duration;
import java.util.Scanner;

public class CheckMembershipMenu {
    private CheckMembershipCtrl ctrl;

    public CheckMembershipMenu(CheckMembershipCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Team Management System ==");
        System.out.println("1. Check student's team enrolment");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice: ");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            display();
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    checkMembershipDuration();
                    break;
                case 2 :
                    System.out.println("bye bye");
                    break;
                default :
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }

    // complete the checkMembershipDuration method here
    public void checkMembershipDuration() {
        Scanner cMDScanner = new Scanner(System.in);
        System.out.print("Enter the student's name> ");
        String name = cMDScanner.nextLine();
        System.out.print("Enter the team's name> ");
        String teamName = cMDScanner.nextLine();
        int duration = ctrl.checkMembershipDuration(name, teamName);
        switch (duration) {
            case -1:
                System.out.println(String.format("%s is not in the team %s.", name, teamName));
                break;
            case 0:
                System.out.println(String.format("%s joined the team when the team is formed.", name));
                break;
            default:
                System.out.println(String.format("%s joined the team %d days after the team was formed.", name, duration));
        }
    }
}