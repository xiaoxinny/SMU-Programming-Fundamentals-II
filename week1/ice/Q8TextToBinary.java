// package week1.ice;

import java.util.*;

//the program handles only positive decimals
public class Q8TextToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text message: ");
        String text = sc.nextLine();

        String overallBinaryString = new String("");

        for (char x: text.toCharArray()) {
            int currentNum = (int)x;
            String binaryString = new String("");

            while (currentNum > 1) {
                binaryString += Integer.toString(currentNum % 2);
                currentNum = currentNum/2;
            }
            binaryString += Integer.toString(currentNum);
            StringBuilder sb = new StringBuilder(binaryString);
            overallBinaryString += "0".repeat(8-binaryString.length()) + sb.reverse().toString();
        }

        System.out.println(overallBinaryString);

    }
}