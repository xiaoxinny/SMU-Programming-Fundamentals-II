/*
 * Name: Jiaxin Yi
 * Email ID: jiaxin.yi.2025
 */

public class Q1b {
    /*
     * Write the method stringToDouble
     */
    public static double stringToDouble(String inputStr) {
        // Insert your code here.

        return -1.0; // Please modify accordingly!
    }

    // Do not modify the following codes
    public static void main(String[] args) {
        int tcNum = 1;

        {
            String input = "";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: stringToDouble(\"%s\")%n", tcNum++, input);
            double expected = 0.0;
            double actual = stringToDouble(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (Double.compare(expected, actual) == 0) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            String input = "   -42.0001";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: stringToDouble(\"%s\")%n", tcNum++, input);
            double expected = -42.0001;
            double actual = stringToDouble(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (Double.compare(expected, actual) == 0) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            String input = "123.45.67";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: stringToDouble(\"%s\")%n", tcNum++, input);
            double expected = 123.45;
            double actual = stringToDouble(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (Double.compare(expected, actual) == 0) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            String input = " 3.15e2";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: stringToDouble(\"%s\")%n", tcNum++, input);
            double expected = 315.0;
            double actual = stringToDouble(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (Double.compare(expected, actual) == 0) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            String input = " -4.15e-2";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: stringToDouble(\"%s\")%n", tcNum++, input);
            double expected = -0.0415;
            double actual = stringToDouble(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (Double.compare(expected, actual) == 0) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            String input = "e456";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: stringToDouble(\"%s\")%n", tcNum++, input);
            double expected = 0.0;
            double actual = stringToDouble(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (Double.compare(expected, actual) == 0) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            String input = "aec";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: stringToDouble(\"%s\")%n", tcNum++, input);
            double expected = 0.0;
            double actual = stringToDouble(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (Double.compare(expected, actual) == 0) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            String input = " -123.45abc";
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: stringToDouble(\"\")%n", tcNum++);
            double expected = -123.45;
            double actual = stringToDouble(input);
            System.out.println("Expected: " + expected);
            System.out.println("Actual  : " + actual);
            if (Double.compare(expected, actual) == 0) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }
    }
}
