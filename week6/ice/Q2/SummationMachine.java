import java.io.*;
import java.util.*;

public class SummationMachine {
    public static void main(String[] args) {
        new SummationMachine().start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename> ");
        String filename = sc.nextLine();
        File file = new File(filename);

        if (file.exists()) {
            try (Scanner fileSc = new Scanner(file)) {
                int sum = 0;
                while (fileSc.hasNextInt()) {
                    sum += fileSc.nextInt();
                }
                System.out.println("The sum is " + sum);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            sc.close();
        } else {
            System.out.println(filename + " is invalid");
            start(); 
        }
    }
}
