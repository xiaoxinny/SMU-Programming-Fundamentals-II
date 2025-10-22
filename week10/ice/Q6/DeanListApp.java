import java.util.*;
import java.io.*;

public class DeanListApp {
    // There are definitely more ways to do this, such as using a HashMap, creating a student class, etc.
    public static void main(String[] args) {
        File file = new File("result.csv");
        List<String> deanListStudents = new ArrayList<>();
        try (Scanner fileReader = new Scanner(file)) {
            fileReader.nextLine();
            while(fileReader.hasNext()) {
                String[] currDetails = fileReader.nextLine().split(",");
                if (Double.parseDouble(currDetails[currDetails.length-1]) > 3.7) {
                    deanListStudents.add(currDetails[0]);
                }
            }
            System.out.println(deanListStudents);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
