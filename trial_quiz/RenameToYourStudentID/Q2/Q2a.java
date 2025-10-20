/*
 * Name:
 * Email ID:
 */

import java.util.*;
import java.io.*;

public class Q2a {

    /*
     * Write the method getAverageAge 
     */
    public static double getAverageAge(String filename, String surname) {
        // insert your code here
        File file = new File(filename);
        ArrayList<Integer> ageArray = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] splitLine = line.split("-");
                for (String x : splitLine[0].split(" ")) {
                    if (x.equals(x.toUpperCase()) && x.toLowerCase().equals(surname.toLowerCase())) {
                        ageArray.add(Integer.valueOf(splitLine[splitLine.length-1]));
                    }
                }
            }
            int total = 0;
            if (!ageArray.isEmpty()) {
                for (Integer i : ageArray) {
                    total += i;
                }
                return total / ageArray.size();
            } else {
                return total;
            }
        } catch (FileNotFoundException e) {
            return -1;
        }
    }

    //Do not modify the following codes
    public static void main(String[] args) {
        int tcNum = 1;
        {
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: getAverageAge(%s, %s)%n", tcNum++, "persons.txt", "LEE");
            double expected = 36.0;
            double actual = getAverageAge("persons.txt", "LEE");
            System.out.println("Expected : " + expected);
            System.out.println("Actual   : " + actual);
            if (expected == actual) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }
        {
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: getAverageAge(%s, %s)%n", tcNum++, "persons.txt", "Lee");
            double expected = 36.0;
            double actual = getAverageAge("persons.txt", "Lee");
            System.out.println("Expected : " + expected);
            System.out.println("Actual   : " + actual);
            if (expected == actual) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }
        {
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: getAverageAge(%s, %s)%n", tcNum++, "persons.txt", "WONG");
            double expected = 25.0;
            double actual = getAverageAge("persons.txt", "WONG");
            System.out.println("Expected : " + expected);
            System.out.println("Actual   : " + actual);
            if (expected == actual) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }
        {
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: getAverageAge(%s, %s)%n", tcNum++, "persons.txt", "Chan");
            double expected = 27.0;
            double actual = getAverageAge("persons.txt", "Chan");
            System.out.println("Expected : " + expected);
            System.out.println("Actual   : " + actual);
            if (expected == actual) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }
        {
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: getAverageAge(%s, %s)%n", tcNum++, "persons.txt", "Ong");
            double expected = 0.0;
            double actual = getAverageAge("persons.txt", "Ong");
            System.out.println("Expected : " + expected);
            System.out.println("Actual   : " + actual);
            if (expected == actual) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }

        {
            System.out.println("-------------------------------------------------------");
            System.out.printf("Test %d: getAverageAge(%s, %s)%n", tcNum++, "nosuchfile.txt", "Lee");
            double expected = -1.0;
            double actual = getAverageAge("nosuchfile.txt", "Lee");
            System.out.println("Expected : " + expected);
            System.out.println("Actual   : " + actual);
            if (expected == actual) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            System.out.println("-------------------------------------------------------");
        }
    }
}
