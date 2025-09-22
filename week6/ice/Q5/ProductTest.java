
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class ProductTest {

  public static void main(String[] args) {
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));

    save(products, "data\\product.csv");
  }

  public static void save(ArrayList<Product> productList, String pathAndFileName) {
    //TODO: goes through products and saves each Product as a line in file
    //format: name,quantity,price
    try {
      PrintStream writer = new PrintStream(new FileOutputStream(pathAndFileName, true));
      for (Product p: productList) {
        writer.println(String.format("%s,%d,%.1f", p.getName(), p.getQuantity(), p.getPrice()));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
