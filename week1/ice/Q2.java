import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first word:");
            String str1 = scanner.nextLine();

            System.out.println("Enter second word:");
            String str2 = scanner.nextLine();
            
            if (str1.substring(0,1).equals(str2.substring(0,1))) {
                System.out.println("Bingo");
                break;
            } else {
                System.out.println("Try again.");
            }
        }
    }
}