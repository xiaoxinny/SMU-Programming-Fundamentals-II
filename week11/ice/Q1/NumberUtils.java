
import java.util.*;
import javax.swing.Painter;

public class NumberUtils {

    public static Map<Integer, Integer> calculateFrequency(int[] arr) {
        try {
            Map<Integer, Integer> frequencies = new HashMap<>();
            for (int i : arr) {
                frequencies.put(i, frequencies.getOrDefault(i, 0) + 1);
            }
            return frequencies;
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }

    public static int[] createArray(Map<Integer, Integer> freqMap) {
        try {
            ArrayList<Integer> numberList = new ArrayList<>();
            for (Map.Entry<Integer, Integer> en : freqMap.entrySet()) {
                for (int i = 0; i < en.getValue(); i++) {
                    numberList.add(en.getKey());
                }
            }
            int[] result = new int[numberList.size()];

            for (int i = 0; i < numberList.size(); i++) {
                result[i] = numberList.get(i);
            }

            return result;
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }

    public static int max(int[] arr) {
        try {
            int max = Integer.MIN_VALUE;
            if (arr.length > 0) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                return max;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }

    public static int max(int x, int y, int z) {
        try {
            int[] arr = {x, y, z};
            return max(arr);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }

    public static List<Pair> findPairs(int[] arr, int value) {
        List<Pair> pairList = new ArrayList<>();
        try {
            int count = 0;
            for (int i : arr) {
                for (int j = count + 1; j < arr.length; j++) {
                    if (i + arr[j] == value) {
                        pairList.add(new Pair(i, arr[j]));
                    }
                }
                count++;
            }

            return pairList;
        } catch (NullPointerException e) {
            return pairList;
        }
    }

    public static int findTheMissingNumber(int[] arr, int n) {
        if (arr == null) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 1; i <= n; i++) {
                boolean status = false;
                for (int j : arr) {
                    if (j == i) {
                        status = true;
                    }
                }
                if (!status) {
                    return i;
                }
            }
            return 0;
        }
    }
}
