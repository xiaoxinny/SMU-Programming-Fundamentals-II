import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DelimiterReading {
    public static void main(String[] args) {
        new DelimiterReading().start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename> ");
        String filename = sc.nextLine();
        File file = new File(filename);

        if (file.exists()) {
            try (Scanner fileSc = new Scanner(file)) {
                while (fileSc.hasNextLine()) {
                    String line = fileSc.nextLine();
                    Scanner row = new Scanner(line);
                    row.useDelimiter(",");

                    int sum = 0;
                    while (row.hasNextInt()) {
                        sum += row.nextInt();
                    }
                    System.out.println(sum);

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
