import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        ArrayList<String> reversedWords = new ArrayList<>();

        for(String word: words) {
            reversedWords.add(word);
        }

        Collections.reverse(reversedWords);
        System.out.println(String.join(" ", reversedWords)); 
    }
}