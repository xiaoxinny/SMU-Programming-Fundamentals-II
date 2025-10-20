
import java.util.*;

public class HashMapTraverser {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 3);
        map.put(1, 2);
        map.put(-2, -2);
        map.put(-3, 4);

        HashMap<Integer, Boolean> map2 = new HashMap<>();
        map2.put(0, true);
        map2.put(1, true);
        map2.put(2, false);
        map2.put(3, true);

        HashMapTraverser.printAllPositiveKeys(map);
        HashMapTraverser.printAllPositiveValues(map);
        HashMapTraverser.printAllKeysWithValuesEqualToTrue(map2);
        System.out.println(HashMapTraverser.checkIfBothKeysExist(map, 1, 4));
        System.out.println(HashMapTraverser.checkIfBothKeysExist(map, 1, -3));
    }

    //  Implement missing methods here
    public static void printAllPositiveKeys(HashMap<Integer, Integer> map) {
        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            int currKey = keys.next();
            if (currKey > 0) {
                System.out.print(currKey + " ");
            }
        }
		System.out.println();
    }

    public static void printAllPositiveValues(HashMap<Integer, Integer> map) {
        Iterator<Integer> values = map.values().iterator();
        while (values.hasNext()) {
            int currValue = values.next();
            if (currValue > 0) {
                System.out.print(currValue + " ");
            }
        }
		System.out.println();
    }

    public static void printAllKeysWithValuesEqualToTrue(HashMap<Integer, Boolean> map) {
        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            int currKey = keys.next();
            if (map.get(currKey)) {
                System.out.print(currKey + " ");
            }
        }
		System.out.println();
    }

    public static boolean checkIfBothKeysExist(HashMap<Integer, Integer> map, int k1, int k2) {
		return (map.containsKey(k1) && map.containsKey(k2));
    }
    // ********************************

}
