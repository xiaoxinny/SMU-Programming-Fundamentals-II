
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q2_TextFileReader {

    public static void main(String[] args) {
        String fileNameAndPath = "data/students.txt";
        try {
            Scanner sc = new Scanner(new File(fileNameAndPath));             
            System.out.println("Yes, " + fileNameAndPath + " exists");
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No, " + fileNameAndPath + " does not exist");
        }
    }
}
