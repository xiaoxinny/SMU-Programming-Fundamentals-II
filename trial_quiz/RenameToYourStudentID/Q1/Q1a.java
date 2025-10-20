/*
 * Name: Jiaxin Yi
 * Email ID: jiaxin.yi.2025
 */

import java.util.*;

public class Q1a {
    /*
     * Write the method reorderWordsInSentence
     */
    public static String reorderWordsInSentence(String sentence) {
        // Insert your code here.
        String cleanedSentence = sentence.strip();
        String[] splitSentence = cleanedSentence.split(" ");
        ArrayList<String> sortedStrings = new ArrayList<>();
        for (String x: splitSentence) {
            char[] y = x.toCharArray();
            Arrays.sort(y);
            sortedStrings.add(new String(y));
        }

        return String.join(" ", sortedStrings); // Please modify accordingly!
    }

    // Do not modify the following codes
    public static void main(String[] args) {
        int tcNum = 1;

        {
            String input = " hello, SMU! ";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: reorderWordsInSentence(\"%s\")%n", tcNum++, input);
            String expected = "ehllo, MSU!";
            String actual = reorderWordsInSentence(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (expected.equals(actual)) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            String input = "java programming is interesting.   ";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: reorderWordsInSentence(\"%s\")%n", tcNum++, input);
            String expected = "aajv aggimmnoprr is eegiinnrstt.";
            String actual = reorderWordsInSentence(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (expected.equals(actual)) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            String input = "hello world, this     is great!";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: reorderWordsInSentence(\"%s\")%n", tcNum++, input);
            String expected = "ehllo dlorw, hist     is aegrt!";
            String actual = reorderWordsInSentence(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (expected.equals(actual)) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }
       
    }
}
