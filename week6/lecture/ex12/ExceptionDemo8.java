
import java.io.*;

public class ExceptionDemo8 {

    public static void main(String[] args) {
        try {
            PrintStream writer = new PrintStream(
                    new FileOutputStream("c:\\test.txt", false));
        } catch (Error e) {
            System.out.println("catch");
        }
    }
}
