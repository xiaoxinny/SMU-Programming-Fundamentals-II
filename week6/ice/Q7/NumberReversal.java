import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.*;

public class NumberReversal {
    public static void main(String[] args) {
        new NumberReversal().start();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename> ");
        String filename = sc.nextLine();
        File file = new File(filename);
        if (file.exists()) {
            try (Scanner fileSc = new Scanner(file)) {
                while (fileSc.hasNextLine()) {
                    ArrayList<Integer> numbers = new ArrayList<>();
                    String line = fileSc.nextLine();
                    Scanner row = new Scanner(line);
                    row.useDelimiter(",");

                    while (row.hasNextInt()) {
                        numbers.add(row.nextInt());
                    }
                    Collections.reverse(numbers);
                    System.out.println(numbers.stream().map(Object::toString).collect(Collectors.joining(",")));
                    row.close();
                }
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
