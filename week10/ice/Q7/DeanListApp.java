
import java.io.*;
import java.util.*;

import org.apache.commons.csv.*;

public class DeanListApp {

    public static void main(String[] args) {
        List<String> deanListStuds = new ArrayList<>();
        try (Reader in = new FileReader("result.csv")) {
        Iterable<CSVRecord> records = CSVFormat.EXCEL
            .withFirstRecordAsHeader()
            .parse(in);
            for (CSVRecord record : records) {
                double gpa = Double.parseDouble(record.get("GPA"));
                if (gpa > 3.7) {
                    deanListStuds.add(record.get("name"));
                }
            }
            System.out.println(deanListStuds);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
