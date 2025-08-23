import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        ArrayList<String> strArray = new ArrayList<>();
        while (true) {
            Integer currentInteger = scanner.nextInt();
            if (currentInteger > 0) {
                numbers.add(currentInteger);
            } else {
                if (numbers.size() > 0) {
                    for (int i = 0; i < numbers.size(); i++) {
                        sum = sum * numbers.get(i);
                        strArray.add(Integer.toString(numbers.get(i)));
                    }
                    System.out.println(String.join(" x ", strArray) + " = " + Integer.toString(sum));
                } else {
                    System.out.println("No positive number is entered.");
                }
                break;
            }
        }
    }
}