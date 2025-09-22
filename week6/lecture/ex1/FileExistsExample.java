import java.io.*;

public class FileExistsExample { 
    public static void main(String[] args) {
        File f = new File("C:\\Users\\yijia\\Downloads\\output.txt");
        if (f.exists()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}