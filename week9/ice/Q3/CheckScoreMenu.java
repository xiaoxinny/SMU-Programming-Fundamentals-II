
import java.util.Scanner;
import javax.swing.text.html.CSS;

public class CheckScoreMenu {

    private CheckScoreCtrl ctrl;

    public CheckScoreMenu(CheckScoreCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Quiz Management System ==");
        System.out.println("1. Check student's score");
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
                case 1:
                    checkScore();
                    break;
                case 2:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }

    public void checkScore() {
        Scanner cSScanner = new Scanner(System.in);
        System.out.print("Enter the student's name> ");
        String name = cSScanner.nextLine();
        System.out.print("Enter the quiz's name> ");
        String quizName = cSScanner.nextLine();
        try {
            double difference = ctrl.calculateDifferenceFromAverage(name, quizName);
            if (difference > 0) {
                System.out.println(String.format("%s is %.1f marks above the average.", name, difference));
            } else if (difference == 0) {
                System.out.println(String.format("%s is sitting on the fence!", name));
            } else {
                System.out.println(String.format("%s is %.1f marks below the average.", name, Math.abs(difference)));
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
