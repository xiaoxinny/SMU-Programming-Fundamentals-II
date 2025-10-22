import java.util.*;

public class FrequencyApp {
    public static void main(String[] args) {
        HashMap<String,Integer> frequency = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the word> ");
            String word = sc.nextLine();
            if(word.equals("")) {
                System.out.println("Frequency Count:");
                for (HashMap.Entry<String,Integer> entry: frequency.entrySet()) {
                    System.out.println(String.format("%d %s", entry.getValue(), entry.getKey()));
                }
                break;
            } else {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }
    }
}