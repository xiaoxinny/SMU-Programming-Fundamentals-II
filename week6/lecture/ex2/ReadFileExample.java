import java.io.*;
import java.util.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\yijia\\Downloads\\output.txt");
            Scanner fIn= new Scanner(file);
            while (fIn.hasNext()) {
                String curLine= fIn.nextLine();
                System.out.println(curLine);
            }
            fIn.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
