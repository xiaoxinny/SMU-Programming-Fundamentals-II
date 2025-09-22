
import java.io.*;

public class ExceptionDemo12 {

    public static void main(String[] args) throws Exception {
        PrintStream writer = new PrintStream(
                new FileOutputStream(
                        "S:\\test.txt", false));
    }
}
