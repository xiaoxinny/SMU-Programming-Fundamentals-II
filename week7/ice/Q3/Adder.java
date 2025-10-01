import java.util.InputMismatchException;
import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Adder.getNumber(sc, 1);
        System.out.println();
        int num2 = Adder.getNumber(sc, 2);

        int sum = num1 + num2;

        System.out.println();
        System.out.println("The answer is " + sum);
    }
    
    private static int getNumber(Scanner sc, int num) {
        System.out.print(String.format("Enter num %d>", num));
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!");
            sc.nextLine();
            Adder.getNumber(sc, num);
            return 0;
        }
    }
}