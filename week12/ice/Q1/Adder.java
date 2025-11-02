import com.sun.jdi.Value;
import java.util.ArrayList;
import java.util.List;

public class Adder {

    public static void main(String[] args) {
        List<String> integers = new ArrayList<>();

        for (String s : args) {
            try {
                int value = Integer.parseInt(s);
                integers.add(s);
            } catch (NumberFormatException e) {
            }
        }

        System.out.println(String.join(" + ", integers) + " = " + integers.stream().mapToInt(Integer::valueOf).sum());
    }
}
