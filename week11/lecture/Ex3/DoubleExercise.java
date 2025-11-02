
public class DoubleExercise {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] twoTimes;
        System.out.println(original[0] + " " + original[1]
                + " " + original[2] + " " + original[3]);
// 1. Construct an array object for twoTimes.
        twoTimes = new int[4];
// 2. Put values in twoTimes that are twice the
// corresponding values in original.
        twoTimes[0] = original[0] *2;
        twoTimes[1] = original[1] *2;
        twoTimes[2] = original[2] *2;
        twoTimes[3] = original[3] *2;
        System.out.println(twoTimes[0] + " " + twoTimes[1] + " " + twoTimes[2] + " " + twoTimes[3]);
    }
}
