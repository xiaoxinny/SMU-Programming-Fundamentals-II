import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteFileExample {
    public static void main(String[] args) {
        try  {
            PrintStream writer = new PrintStream(
                new FileOutputStream("test.txt", true)
            );
            writer.println(2);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}