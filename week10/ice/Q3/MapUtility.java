
import java.util.*;

public class MapUtility {

    public static void main(String[] args) {
        Map<String, String> input = new HashMap<>();
        input.put("Alfred", "81");
        input.put("Elise", "61");
        input.put("Billy", "41");
        input.put("Daniel", "41");
        input.put("Charlie", "54");

        System.out.println("Input:  " + input);
        Map<String, List<String>> result = reverse(input);
        System.out.println("Output: " + result);

    }

    private static Map<String, List<String>> reverse(Map<String, String> map) {
        Map<String, List<String>> result = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getValue();
            if(result.containsKey(key)) {
                List<String> value = result.get(key);
                value.add(entry.getKey());
                result.put(key, value);
            } else {
                ArrayList<String> arrList = new ArrayList<>(); 
                arrList.add(entry.getKey());
                result.put(key, arrList);
            }
        }

        return result;
    }
}
