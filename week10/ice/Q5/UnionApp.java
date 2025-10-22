
import java.util.*;
import java.util.stream.Collectors;

public class UnionApp {

    public static void main(String[] args) {
        HashSet<Integer> uniqueList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first line> ");
        String[] firstLine = sc.nextLine().split(",");
        System.out.print("Enter second line> ");
        String[] secondLine = sc.nextLine().split(",");
        for (String x : firstLine) {
            uniqueList.add(Integer.valueOf(x));
        }
        for (String x : secondLine) {
            uniqueList.add(Integer.valueOf(x));
        }
        List<Integer> sortedList = new ArrayList<>(uniqueList);
        Collections.sort(sortedList);
        System.out.println(String.join(",", sortedList.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}
