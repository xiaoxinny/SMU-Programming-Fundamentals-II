import java.lang.reflect.Array;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }
    }

    // This method returns true if str2 can be aligned with str1
    // and false otherwise. If there is an alignment, this method
    // also prints out the alignment. See the sample runs of the
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        // Modify the code below to return the correct value.
        int prevIndex = 0;
        ArrayList<String> strArray = new ArrayList<>();
        for (char c : str2.toCharArray()) {
            if (str1.indexOf(c) >= 0) {
                prevIndex = str1.indexOf(c);
                strArray.add(" ".repeat(str1.indexOf(c)-prevIndex));
                strArray.add(Character.toString(c));
            } else {
                return false;
            }
        }
        System.out.println(str1);
        System.out.println(strArray);
        System.out.println(String.join("", strArray));
        return true;
    }

}
