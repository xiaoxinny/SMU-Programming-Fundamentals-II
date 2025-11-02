
import java.util.Arrays;

public class ArrayUtility {

    public static String printArray(int[] array) {
        return Arrays.toString(array);
    }

    public static int sum(int[] numArray) {
        if (numArray != null) {
            return Arrays.stream(numArray).sum();
        } else {
            return 0;
        }
    }

    public static int[] twoTimes(int[] original) {
        if (original != null) {
            return Arrays.stream(original).map(i -> i * 2).toArray();
        } else {
            return original;
        }
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
