
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InventoryApp {

    public static void main(String[] args) {
        new InventoryApp().getFileName();
    }

    private void stockTaking(String fileNameAndPath) {
        File file = new File(fileNameAndPath);
        if (file.exists()) {
            try {
                Scanner fileSc = new Scanner(file);
                double totalCost = 0;
                int totalProducts = 0;
                while (fileSc.hasNext()) {
                    String[] data = fileSc.nextLine().split(",");
                    double cost = Double.parseDouble(data[2]);
                    int count = Integer.valueOf(data[0]);
                    totalCost += cost*count;
                    totalProducts += count;
                    System.out.println(String.format("There are %d %s, each cost $%.2f", count, data[1], cost));
                }
                System.out.println(String.format("There are %d products with a total value of $%.2f to be sold.", totalProducts, totalCost));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void getFileName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename> ");
        String filename = sc.nextLine();
        File file = new File(filename);
        if (file.exists()) {
            stockTaking("product.csv");
        } else {
            System.out.println(filename + " is invalid");
            getFileName();
        }
    }
}
